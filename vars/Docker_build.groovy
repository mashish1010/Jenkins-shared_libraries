def call (String ImageTag, String, String ProjectName, String DockerHubUser ){
 echo "This is building the codes"
 sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."

}
