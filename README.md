# The tests fail

```
~/suztomo/netty-shaded-openssl$ mvn test -DtrimStackTrace=false
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< org.example:netty-shaded-openssl >------------------
[INFO] Building netty-shaded-openssl 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ netty-shaded-openssl ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/ubuntu/suztomo/netty-shaded-openssl/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ netty-shaded-openssl ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-resources-plugin:3.0.2:testResources (default-testResources) @ netty-shaded-openssl ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/ubuntu/suztomo/netty-shaded-openssl/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ netty-shaded-openssl ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.1:test (default-test) @ netty-shaded-openssl ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.example.NettyOpenSSLTest
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.103 s <<< FAILURE! - in org.example.NettyOpenSSLTest
[ERROR] testOpenSSL(org.example.NettyOpenSSLTest)  Time elapsed: 0.08 s  <<< ERROR!
java.lang.IllegalArgumentException: Failed to load any of the given libraries: [netty_tcnative_linux_aarch_64, netty_tcnative_linux_aarch_64_fedora, netty_tcnative_aarch_64, netty_tcnative]
	at io.netty.util.internal.NativeLibraryLoader.loadFirstAvailable(NativeLibraryLoader.java:104)
	at io.netty.handler.ssl.OpenSsl.loadTcNative(OpenSsl.java:590)
	at io.netty.handler.ssl.OpenSsl.<clinit>(OpenSsl.java:136)
	at org.example.NettyOpenSSLTest.testOpenSSL(NettyOpenSSLTest.java:10)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:365)
	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:273)
	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)
	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:159)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
	Suppressed: java.lang.UnsatisfiedLinkError: could not load a native library: netty_tcnative_linux_aarch_64
		at io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:226)
		at io.netty.util.internal.NativeLibraryLoader.loadFirstAvailable(NativeLibraryLoader.java:96)
		... 28 more
	Caused by: java.io.FileNotFoundException: META-INF/native/libnetty_tcnative_linux_aarch_64.so
		at io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:175)
		... 29 more
		Suppressed: java.lang.UnsatisfiedLinkError: no netty_tcnative_linux_aarch_64 in java.library.path: [/usr/java/packages/lib, /usr/lib/aarch64-linux-gnu/jni, /lib/aarch64-linux-gnu, /usr/lib/aarch64-linux-gnu, /usr/lib/jni, /lib, /usr/lib]
			at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2670)
			at java.base/java.lang.Runtime.loadLibrary0(Runtime.java:830)
			at java.base/java.lang.System.loadLibrary(System.java:1873)
			at io.netty.util.internal.NativeLibraryUtil.loadLibrary(NativeLibraryUtil.java:38)
			at io.netty.util.internal.NativeLibraryLoader.loadLibrary(NativeLibraryLoader.java:351)
			at io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:136)
			... 29 more
			Suppressed: java.lang.UnsatisfiedLinkError: no netty_tcnative_linux_aarch_64 in java.library.path: [/usr/java/packages/lib, /usr/lib/aarch64-linux-gnu/jni, /lib/aarch64-linux-gnu, /usr/lib/aarch64-linux-gnu, /usr/lib/jni, /lib, /usr/lib]
				at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2670)
				at java.base/java.lang.Runtime.loadLibrary0(Runtime.java:830)
				at java.base/java.lang.System.loadLibrary(System.java:1873)
				at io.netty.util.internal.NativeLibraryUtil.loadLibrary(NativeLibraryUtil.java:38)
				at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
				at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
				at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
				at java.base/java.lang.reflect.Method.invoke(Method.java:566)
				at io.netty.util.internal.NativeLibraryLoader$1.run(NativeLibraryLoader.java:371)
				at java.base/java.security.AccessController.doPrivileged(Native Method)
				at io.netty.util.internal.NativeLibraryLoader.loadLibraryByHelper(NativeLibraryLoader.java:363)
				at io.netty.util.internal.NativeLibraryLoader.loadLibrary(NativeLibraryLoader.java:341)
				... 30 more
	Suppressed: java.lang.UnsatisfiedLinkError: could not load a native library: netty_tcnative_linux_aarch_64_fedora
		at io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:226)
		at io.netty.util.internal.NativeLibraryLoader.loadFirstAvailable(NativeLibraryLoader.java:96)
		... 28 more
	Caused by: java.io.FileNotFoundException: META-INF/native/libnetty_tcnative_linux_aarch_64_fedora.so
		at io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:175)
		... 29 more
		Suppressed: java.lang.UnsatisfiedLinkError: no netty_tcnative_linux_aarch_64_fedora in java.library.path: [/usr/java/packages/lib, /usr/lib/aarch64-linux-gnu/jni, /lib/aarch64-linux-gnu, /usr/lib/aarch64-linux-gnu, /usr/lib/jni, /lib, /usr/lib]
			at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2670)
			at java.base/java.lang.Runtime.loadLibrary0(Runtime.java:830)
			at java.base/java.lang.System.loadLibrary(System.java:1873)
			at io.netty.util.internal.NativeLibraryUtil.loadLibrary(NativeLibraryUtil.java:38)
			at io.netty.util.internal.NativeLibraryLoader.loadLibrary(NativeLibraryLoader.java:351)
			at io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:136)
			... 29 more
			Suppressed: java.lang.UnsatisfiedLinkError: no netty_tcnative_linux_aarch_64_fedora in java.library.path: [/usr/java/packages/lib, /usr/lib/aarch64-linux-gnu/jni, /lib/aarch64-linux-gnu, /usr/lib/aarch64-linux-gnu, /usr/lib/jni, /lib, /usr/lib]
				at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2670)
				at java.base/java.lang.Runtime.loadLibrary0(Runtime.java:830)
				at java.base/java.lang.System.loadLibrary(System.java:1873)
				at io.netty.util.internal.NativeLibraryUtil.loadLibrary(NativeLibraryUtil.java:38)
				at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
				at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
				at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
				at java.base/java.lang.reflect.Method.invoke(Method.java:566)
				at io.netty.util.internal.NativeLibraryLoader$1.run(NativeLibraryLoader.java:371)
				at java.base/java.security.AccessController.doPrivileged(Native Method)
				at io.netty.util.internal.NativeLibraryLoader.loadLibraryByHelper(NativeLibraryLoader.java:363)
				at io.netty.util.internal.NativeLibraryLoader.loadLibrary(NativeLibraryLoader.java:341)
				... 30 more
	Suppressed: java.lang.UnsatisfiedLinkError: could not load a native library: netty_tcnative_aarch_64
		at io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:226)
		at io.netty.util.internal.NativeLibraryLoader.loadFirstAvailable(NativeLibraryLoader.java:96)
		... 28 more
	Caused by: java.io.FileNotFoundException: META-INF/native/libnetty_tcnative_aarch_64.so
		at io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:175)
		... 29 more
		Suppressed: java.lang.UnsatisfiedLinkError: no netty_tcnative_aarch_64 in java.library.path: [/usr/java/packages/lib, /usr/lib/aarch64-linux-gnu/jni, /lib/aarch64-linux-gnu, /usr/lib/aarch64-linux-gnu, /usr/lib/jni, /lib, /usr/lib]
			at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2670)
			at java.base/java.lang.Runtime.loadLibrary0(Runtime.java:830)
			at java.base/java.lang.System.loadLibrary(System.java:1873)
			at io.netty.util.internal.NativeLibraryUtil.loadLibrary(NativeLibraryUtil.java:38)
			at io.netty.util.internal.NativeLibraryLoader.loadLibrary(NativeLibraryLoader.java:351)
			at io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:136)
			... 29 more
			Suppressed: java.lang.UnsatisfiedLinkError: no netty_tcnative_aarch_64 in java.library.path: [/usr/java/packages/lib, /usr/lib/aarch64-linux-gnu/jni, /lib/aarch64-linux-gnu, /usr/lib/aarch64-linux-gnu, /usr/lib/jni, /lib, /usr/lib]
				at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2670)
				at java.base/java.lang.Runtime.loadLibrary0(Runtime.java:830)
				at java.base/java.lang.System.loadLibrary(System.java:1873)
				at io.netty.util.internal.NativeLibraryUtil.loadLibrary(NativeLibraryUtil.java:38)
				at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
				at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
				at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
				at java.base/java.lang.reflect.Method.invoke(Method.java:566)
				at io.netty.util.internal.NativeLibraryLoader$1.run(NativeLibraryLoader.java:371)
				at java.base/java.security.AccessController.doPrivileged(Native Method)
				at io.netty.util.internal.NativeLibraryLoader.loadLibraryByHelper(NativeLibraryLoader.java:363)
				at io.netty.util.internal.NativeLibraryLoader.loadLibrary(NativeLibraryLoader.java:341)
				... 30 more
	Suppressed: java.lang.UnsatisfiedLinkError: could not load a native library: netty_tcnative
		at io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:226)
		at io.netty.util.internal.NativeLibraryLoader.loadFirstAvailable(NativeLibraryLoader.java:96)
		... 28 more
	Caused by: java.io.FileNotFoundException: META-INF/native/libnetty_tcnative.so
		at io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:175)
		... 29 more
		Suppressed: java.lang.UnsatisfiedLinkError: no netty_tcnative in java.library.path: [/usr/java/packages/lib, /usr/lib/aarch64-linux-gnu/jni, /lib/aarch64-linux-gnu, /usr/lib/aarch64-linux-gnu, /usr/lib/jni, /lib, /usr/lib]
			at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2670)
			at java.base/java.lang.Runtime.loadLibrary0(Runtime.java:830)
			at java.base/java.lang.System.loadLibrary(System.java:1873)
			at io.netty.util.internal.NativeLibraryUtil.loadLibrary(NativeLibraryUtil.java:38)
			at io.netty.util.internal.NativeLibraryLoader.loadLibrary(NativeLibraryLoader.java:351)
			at io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:136)
			... 29 more
			Suppressed: java.lang.UnsatisfiedLinkError: no netty_tcnative in java.library.path: [/usr/java/packages/lib, /usr/lib/aarch64-linux-gnu/jni, /lib/aarch64-linux-gnu, /usr/lib/aarch64-linux-gnu, /usr/lib/jni, /lib, /usr/lib]
				at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2670)
				at java.base/java.lang.Runtime.loadLibrary0(Runtime.java:830)
				at java.base/java.lang.System.loadLibrary(System.java:1873)
				at io.netty.util.internal.NativeLibraryUtil.loadLibrary(NativeLibraryUtil.java:38)
				at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
				at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
				at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
				at java.base/java.lang.reflect.Method.invoke(Method.java:566)
				at io.netty.util.internal.NativeLibraryLoader$1.run(NativeLibraryLoader.java:371)
				at java.base/java.security.AccessController.doPrivileged(Native Method)
				at io.netty.util.internal.NativeLibraryLoader.loadLibraryByHelper(NativeLibraryLoader.java:363)
				at io.netty.util.internal.NativeLibraryLoader.loadLibrary(NativeLibraryLoader.java:341)
				... 30 more

[INFO] Running org.example.GrpcNettyShadedOpenSSLTest
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.001 s <<< FAILURE! - in org.example.GrpcNettyShadedOpenSSLTest
[ERROR] testOpenSSL(org.example.GrpcNettyShadedOpenSSLTest)  Time elapsed: 0.001 s  <<< ERROR!
java.lang.IllegalArgumentException: Failed to load any of the given libraries: [netty_tcnative_linux_aarch_64, netty_tcnative_linux_aarch_64_fedora, netty_tcnative_aarch_64, netty_tcnative]
	at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.loadFirstAvailable(NativeLibraryLoader.java:104)
	at io.grpc.netty.shaded.io.netty.handler.ssl.OpenSsl.loadTcNative(OpenSsl.java:590)
	at io.grpc.netty.shaded.io.netty.handler.ssl.OpenSsl.<clinit>(OpenSsl.java:136)
	at org.example.GrpcNettyShadedOpenSSLTest.testOpenSSL(GrpcNettyShadedOpenSSLTest.java:12)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:365)
	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:273)
	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)
	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:159)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
	Suppressed: java.lang.UnsatisfiedLinkError: could not load a native library: io_grpc_netty_shaded_netty_tcnative_linux_aarch_64
		at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:226)
		at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.loadFirstAvailable(NativeLibraryLoader.java:96)
		... 28 more
	Caused by: java.io.FileNotFoundException: META-INF/native/libio_grpc_netty_shaded_netty_tcnative_linux_aarch_64.so
		at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:175)
		... 29 more
		Suppressed: java.lang.UnsatisfiedLinkError: no io_grpc_netty_shaded_netty_tcnative_linux_aarch_64 in java.library.path: [/usr/java/packages/lib, /usr/lib/aarch64-linux-gnu/jni, /lib/aarch64-linux-gnu, /usr/lib/aarch64-linux-gnu, /usr/lib/jni, /lib, /usr/lib]
			at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2670)
			at java.base/java.lang.Runtime.loadLibrary0(Runtime.java:830)
			at java.base/java.lang.System.loadLibrary(System.java:1873)
			at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryUtil.loadLibrary(NativeLibraryUtil.java:38)
			at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.loadLibrary(NativeLibraryLoader.java:351)
			at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:136)
			... 29 more
			Suppressed: java.lang.UnsatisfiedLinkError: no io_grpc_netty_shaded_netty_tcnative_linux_aarch_64 in java.library.path: [/usr/java/packages/lib, /usr/lib/aarch64-linux-gnu/jni, /lib/aarch64-linux-gnu, /usr/lib/aarch64-linux-gnu, /usr/lib/jni, /lib, /usr/lib]
				at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2670)
				at java.base/java.lang.Runtime.loadLibrary0(Runtime.java:830)
				at java.base/java.lang.System.loadLibrary(System.java:1873)
				at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryUtil.loadLibrary(NativeLibraryUtil.java:38)
				at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
				at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
				at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
				at java.base/java.lang.reflect.Method.invoke(Method.java:566)
				at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader$1.run(NativeLibraryLoader.java:371)
				at java.base/java.security.AccessController.doPrivileged(Native Method)
				at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.loadLibraryByHelper(NativeLibraryLoader.java:363)
				at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.loadLibrary(NativeLibraryLoader.java:341)
				... 30 more
	Suppressed: java.lang.UnsatisfiedLinkError: could not load a native library: io_grpc_netty_shaded_netty_tcnative_linux_aarch_64_fedora
		at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:226)
		at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.loadFirstAvailable(NativeLibraryLoader.java:96)
		... 28 more
	Caused by: java.io.FileNotFoundException: META-INF/native/libio_grpc_netty_shaded_netty_tcnative_linux_aarch_64_fedora.so
		at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:175)
		... 29 more
		Suppressed: java.lang.UnsatisfiedLinkError: no io_grpc_netty_shaded_netty_tcnative_linux_aarch_64_fedora in java.library.path: [/usr/java/packages/lib, /usr/lib/aarch64-linux-gnu/jni, /lib/aarch64-linux-gnu, /usr/lib/aarch64-linux-gnu, /usr/lib/jni, /lib, /usr/lib]
			at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2670)
			at java.base/java.lang.Runtime.loadLibrary0(Runtime.java:830)
			at java.base/java.lang.System.loadLibrary(System.java:1873)
			at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryUtil.loadLibrary(NativeLibraryUtil.java:38)
			at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.loadLibrary(NativeLibraryLoader.java:351)
			at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:136)
			... 29 more
			Suppressed: java.lang.UnsatisfiedLinkError: no io_grpc_netty_shaded_netty_tcnative_linux_aarch_64_fedora in java.library.path: [/usr/java/packages/lib, /usr/lib/aarch64-linux-gnu/jni, /lib/aarch64-linux-gnu, /usr/lib/aarch64-linux-gnu, /usr/lib/jni, /lib, /usr/lib]
				at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2670)
				at java.base/java.lang.Runtime.loadLibrary0(Runtime.java:830)
				at java.base/java.lang.System.loadLibrary(System.java:1873)
				at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryUtil.loadLibrary(NativeLibraryUtil.java:38)
				at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
				at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
				at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
				at java.base/java.lang.reflect.Method.invoke(Method.java:566)
				at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader$1.run(NativeLibraryLoader.java:371)
				at java.base/java.security.AccessController.doPrivileged(Native Method)
				at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.loadLibraryByHelper(NativeLibraryLoader.java:363)
				at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.loadLibrary(NativeLibraryLoader.java:341)
				... 30 more
	Suppressed: java.lang.UnsatisfiedLinkError: could not load a native library: io_grpc_netty_shaded_netty_tcnative_aarch_64
		at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:226)
		at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.loadFirstAvailable(NativeLibraryLoader.java:96)
		... 28 more
	Caused by: java.io.FileNotFoundException: META-INF/native/libio_grpc_netty_shaded_netty_tcnative_aarch_64.so
		at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:175)
		... 29 more
		Suppressed: java.lang.UnsatisfiedLinkError: no io_grpc_netty_shaded_netty_tcnative_aarch_64 in java.library.path: [/usr/java/packages/lib, /usr/lib/aarch64-linux-gnu/jni, /lib/aarch64-linux-gnu, /usr/lib/aarch64-linux-gnu, /usr/lib/jni, /lib, /usr/lib]
			at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2670)
			at java.base/java.lang.Runtime.loadLibrary0(Runtime.java:830)
			at java.base/java.lang.System.loadLibrary(System.java:1873)
			at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryUtil.loadLibrary(NativeLibraryUtil.java:38)
			at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.loadLibrary(NativeLibraryLoader.java:351)
			at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:136)
			... 29 more
			Suppressed: java.lang.UnsatisfiedLinkError: no io_grpc_netty_shaded_netty_tcnative_aarch_64 in java.library.path: [/usr/java/packages/lib, /usr/lib/aarch64-linux-gnu/jni, /lib/aarch64-linux-gnu, /usr/lib/aarch64-linux-gnu, /usr/lib/jni, /lib, /usr/lib]
				at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2670)
				at java.base/java.lang.Runtime.loadLibrary0(Runtime.java:830)
				at java.base/java.lang.System.loadLibrary(System.java:1873)
				at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryUtil.loadLibrary(NativeLibraryUtil.java:38)
				at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
				at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
				at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
				at java.base/java.lang.reflect.Method.invoke(Method.java:566)
				at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader$1.run(NativeLibraryLoader.java:371)
				at java.base/java.security.AccessController.doPrivileged(Native Method)
				at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.loadLibraryByHelper(NativeLibraryLoader.java:363)
				at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.loadLibrary(NativeLibraryLoader.java:341)
				... 30 more
	Suppressed: java.lang.UnsatisfiedLinkError: could not load a native library: io_grpc_netty_shaded_netty_tcnative
		at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:226)
		at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.loadFirstAvailable(NativeLibraryLoader.java:96)
		... 28 more
	Caused by: java.io.FileNotFoundException: META-INF/native/libio_grpc_netty_shaded_netty_tcnative.so
		at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:175)
		... 29 more
		Suppressed: java.lang.UnsatisfiedLinkError: no io_grpc_netty_shaded_netty_tcnative in java.library.path: [/usr/java/packages/lib, /usr/lib/aarch64-linux-gnu/jni, /lib/aarch64-linux-gnu, /usr/lib/aarch64-linux-gnu, /usr/lib/jni, /lib, /usr/lib]
			at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2670)
			at java.base/java.lang.Runtime.loadLibrary0(Runtime.java:830)
			at java.base/java.lang.System.loadLibrary(System.java:1873)
			at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryUtil.loadLibrary(NativeLibraryUtil.java:38)
			at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.loadLibrary(NativeLibraryLoader.java:351)
			at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.load(NativeLibraryLoader.java:136)
			... 29 more
			Suppressed: java.lang.UnsatisfiedLinkError: no io_grpc_netty_shaded_netty_tcnative in java.library.path: [/usr/java/packages/lib, /usr/lib/aarch64-linux-gnu/jni, /lib/aarch64-linux-gnu, /usr/lib/aarch64-linux-gnu, /usr/lib/jni, /lib, /usr/lib]
				at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2670)
				at java.base/java.lang.Runtime.loadLibrary0(Runtime.java:830)
				at java.base/java.lang.System.loadLibrary(System.java:1873)
				at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryUtil.loadLibrary(NativeLibraryUtil.java:38)
				at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
				at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
				at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
				at java.base/java.lang.reflect.Method.invoke(Method.java:566)
				at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader$1.run(NativeLibraryLoader.java:371)
				at java.base/java.security.AccessController.doPrivileged(Native Method)
				at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.loadLibraryByHelper(NativeLibraryLoader.java:363)
				at io.grpc.netty.shaded.io.netty.util.internal.NativeLibraryLoader.loadLibrary(NativeLibraryLoader.java:341)
				... 30 more

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   GrpcNettyShadedOpenSSLTest.testOpenSSL:12 » IllegalArgument Failed to load any...
[ERROR]   NettyOpenSSLTest.testOpenSSL:10 » IllegalArgument Failed to load any of the gi...
[INFO] 
[ERROR] Tests run: 2, Failures: 0, Errors: 2, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.721 s
[INFO] Finished at: 2021-03-17T14:56:52Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.1:test (default-test) on project netty-shaded-openssl: There are test failures.
[ERROR] 
[ERROR] Please refer to /home/ubuntu/suztomo/netty-shaded-openssl/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```

# Netty-tcnative 2.0.34 does not have correct file

```
~/suztomo/netty-shaded-openssl$ jar tf ~/.m2/repository/io/netty/netty-tcnative-boringssl-static/2.0.34.Final/netty-tcnative-boringssl-static-2.0.34.Final.jar  |grep aarch
META-INF/native/libnetty_tcnative_linux_aarch64.so
```