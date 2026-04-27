def gitdownload(repo)
{
  git "https://github.com/naveendonthula9963-prog/${repo}.git"
}
def buildartifact()
{
  sh 'mvn package'
}
def deployment(jobname,ip,context)
{
sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}"
}

