def call() {
   echo 'This is fetcing the codes from github'
   git url: "https://github.com/mashish1010/ashish-django-notes-app.git", branch: "main"
   echo "git clone successfull"
}
