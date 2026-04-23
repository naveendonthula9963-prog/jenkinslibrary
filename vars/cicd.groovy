def gitdownload(repo)
{
  git "https://github.com/naveendonthula9963-prog/${repo}.git"
}
def buildartifact()
{
  sh 'mvn package'
}
def deployment()
