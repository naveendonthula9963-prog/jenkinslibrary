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
   sh "scp -o StrictHostKeyChecking=no /home/ubuntu/myfile/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/home/ubuntu/temp_${context}.war"
}

