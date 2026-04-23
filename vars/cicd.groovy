def gitdownload(repo)
{
  git "https://github.com/naveendonthula9963-prog/${repo}.git"
}
def buildartifact()
{
  sh 'mvn package'
}
def deployment(jodname,ip,context)
{
  sh "scp /home/ubuntu/myfile/workspace/${jodname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}

