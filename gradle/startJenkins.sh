source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk use java 11.0.24-amzn
export JENKINS_HOME=~/.jenkins
java -jar /Volumes/WorkData/work/mybook/modentesting/tools/jenkins.war
