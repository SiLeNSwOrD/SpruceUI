/*
 * Copyright © 2020 LambdAurora <aurora42lambda@gmail.com>
 *
 * This file is part of SpruceUI.
 *
 * Licensed under the MIT license. For more information,
 * see the LICENSE file.
 */

package me.lambdaurora.spruceui.option;

import net.minecraft.client.gui.widget.AbstractButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

/**
 * Represents a reset option.
 *
 * @author LambdAurora
 * @version 1.6.4
 * @since 1.0.1
 */
public final class SpruceResetOption extends SpruceSimpleActionOption
{
    public SpruceResetOption(@NotNull Consumer<AbstractButtonWidget> action, @Nullable Text tooltip)
    {
        super("spruceui.reset", action, tooltip);
    }

    public SpruceResetOption(@NotNull Consumer<AbstractButtonWidget> action)
    {
        this(action, null);
    }
}
