package com.example.yourmod.mixin;

import com.example.yourmod.config.MidnightConfigExample;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.RunArgs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MixinMinecraftClient {
    /* Mixins allow you to modify default game behaviour.
    This example will print a configurable message after the game has finished initializing.

    If you're using IntelliJ IDEA, you can press CTRL and click at the same time
    to investigate a decompiled version of the Minecraft source code.

    Have a look at the Fabric wiki for more information on this amazing tool:
    https://fabricmc.net/wiki/tutorial:mixin_introduction
    */
    @Inject(at = @At("TAIL"), method = "<init>")
    private void yourmod$onClientInit(RunArgs args, CallbackInfo ci) {
        System.out.println(MidnightConfigExample.name);
    }
}
