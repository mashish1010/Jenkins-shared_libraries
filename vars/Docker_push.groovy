def call(String Project, String ImageTag) {
    withCredentials([usernamePassword(credentialsId: 'docker-hub-creds', 
                                      passwordVariable: 'dockerhubPass', 
                                      usernameVariable: 'dockerhubUser')]) {
        sh "docker login -u ${dockerhubUser} -p ${dockerhubPass}"
        sh "docker push ${dockerhubUser}/${Project}:${ImageTag}"
    }
}
