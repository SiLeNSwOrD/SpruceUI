/*
 * Copyright © 2020 LambdAurora <aurora42lambda@gmail.com>
 *
 * This file is part of SpruceUI.
 *
 * Licensed under the MIT license. For more information,
 * see the LICENSE file.
 */

package me.lambdaurora.spruceui.test.mixin;

import me.lambdaurora.spruceui.SpruceButtonWidget;
import me.lambdaurora.spruceui.test.gui.SpruceMainMenuScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin extends Screen
{
    protected TitleScreenMixin(Text title)
    {
        super(title);
    }

    @Inject(method = "init", at = @At("RETURN"))
    private void onInit(CallbackInfo ci)
    {
        this.addButton(new SpruceButtonWidget(0, 12, 150, 20, new LiteralText("SpruceUI Test Menu"),
                btn -> this.client.openScreen(new SpruceMainMenuScreen(this))));
    }
}
