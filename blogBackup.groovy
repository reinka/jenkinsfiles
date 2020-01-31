#!/usr/bin/env groovy

pipeline{

    agent{
        label "deploy"
    }

    stages{
        stage('Back up blog DB'){
            steps{
                sh """ansible-playbook /home/jenkins/ansible/playbooks/backup.yml \
                  -i /home/jenkins/ansible/inventory \
                  --key-file /home/jenkins/.ssh/id_rsa_nopw 
                """
            }
        }
    }
}
