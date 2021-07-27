package io.github.foa.gsm10;

import net.fabricmc.api.ModInitializer;

public class GsmInit implements ModInitializer {
	@Override
	public void onInitialize() {

		if(Boolean.getBoolean("gsm10.datagen")) {
			try {
				Class<?> datagen = Class.forName("io.github.foa.gsm10.datagen.DatagenInit");
				datagen.getDeclaredMethod("init").invoke(null);
				System.exit(0);
			} catch(ReflectiveOperationException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
