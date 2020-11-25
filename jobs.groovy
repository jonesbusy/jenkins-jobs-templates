pipelineJob('quarkus-graalvm') {
	displayName('quarkus-graalvm')
	description('quarkus-graalvm build')
	definition {
		cpsScm {
			scriptPath('Jenkinsfile')
			scm {
				git {
					remote {
						name('origin')
						branch('master')
						url('https://github.com/jonesbusy/quarkus-graalvm.git')
					}
				}
			}
		}
	}
}
