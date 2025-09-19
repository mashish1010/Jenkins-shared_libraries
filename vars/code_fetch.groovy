def call(String url, String branch) {
   echo 'This is fetcing the codes from github'
   git url: "${url}", branch: "${branch}}"
   echo "git clone successfull"
}
