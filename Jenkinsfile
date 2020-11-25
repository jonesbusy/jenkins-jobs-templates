node('master') {
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
