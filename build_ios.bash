cp -pr build/fat-framework/release build/fat-framework/universal
lipo -create build/bin/iosX64/releaseFramework/libkm.framework/libkm build/bin/iosArm64/releaseFramework/libkm.framework/libkm -output build/fat-framework/universal/libkm.framework/libkm
lipo -create build/bin/iosX64/releaseFramework/libkm.framework/libkm build/bin/iosArm64/releaseFramework/libkm.framework/libkm -output build/fat-framework/universal/libkm.framework/libkm
cd build/fat-framework/universal
zip -r /tmp/libkm.zip *

