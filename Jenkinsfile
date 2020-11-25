node('master') {
	stage('Checkout') {
		checkout([
			'$class' : 'GitSCM',
			branches : scm.branches,
			userRemoteConfigs: scm.userRemoteConfigs,
		])
	}
	stage('Generate jobs') {
		jobDsl([
			ignoreExisting           : false,
			removedConfigFilesAction : 'DELETE',
			removedJobAction         : 'DELETE',
			removedViewAction        : 'DELETE',
			targets                  : '*.groovy',
			unstableOnDeprecation    : true,
		])
	}
}
