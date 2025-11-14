pipeline {
    agent any

    environment {
        DOCKERHUB_CREDENTIALS = credentials('dockerhub-creds')
        DOCKER_IMAGE = "adityadange1/springboot-demo"
        BRANCH = "main"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: "${BRANCH}", url: 'https://github.com/adityadange07/springboot-demo.git'
            }
        }

        stage('Build') {
            steps {
                echo "Building Project..."
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Run Unit Tests') {
            steps {
                echo "Running Tests..."
                sh 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("${DOCKER_IMAGE}:${BUILD_NUMBER}")
                }
            }
        }

        stage('Push to Docker Hub') {
            steps {
                script {
                    docker.withRegistry('', 'dockerhub-creds') {
                        docker.image("${DOCKER_IMAGE}:${BUILD_NUMBER}").push()
                    }
                }
            }
        }

        stage('Deploy to Server') {
            steps {
                sshagent(['prod-server-ssh']) {
                    sh '''
                    ssh -o StrictHostKeyChecking=no user@your-server-ip "
                        docker pull ${DOCKER_IMAGE}:${BUILD_NUMBER}
                        docker stop spring-app || true
                        docker rm spring-app || true
                        docker run -d --name spring-app -p 8080:8080 ${DOCKER_IMAGE}:${BUILD_NUMBER}
                    "
                    '''
                }
            }
        }
    }

    post {
        success {
            echo "Deployment Successful!"
        }
        failure {
            echo "Deployment Failed!"
        }
    }
}
