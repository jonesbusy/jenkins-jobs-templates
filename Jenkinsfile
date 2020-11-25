node('master') {
	stage('Checkout') {
		checkout([
			'$class' : 'GitSCM',
			branches : scm.branches,
			userRemoteConfigs: scm.userRemoteConfigs,
			extensions: [
				[$class: 'CloneOption', noTags: true, shallow: true, depth: 1, reference: ''],
				[$class: 'CleanBeforeCheckout'],
				[$class: 'CleanCheckout'],
			],
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
