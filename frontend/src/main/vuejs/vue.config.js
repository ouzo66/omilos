module.exports = {
  devServer: {
      open: process.platform === 'darwin',
      host: '0.0.0.0',
      port: 8888, // CHANGE YOUR PORT HERE!
      https: false,
      hotOnly: false,
    },
  lintOnSave: false,
  runtimeCompiler: true
}
