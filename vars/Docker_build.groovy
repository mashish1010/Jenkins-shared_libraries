def call (String ImageTag, String ProjectName, String DockerHubUser ){
 echo "This is building the codes"
 sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."

}
