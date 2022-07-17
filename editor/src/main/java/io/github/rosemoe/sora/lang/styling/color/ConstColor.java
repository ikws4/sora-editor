/*
 *    sora-editor - the awesome code editor for Android
 *    https://github.com/Rosemoe/sora-editor
 *    Copyright (C) 2020-2022  Rosemoe
 *
 *     This library is free software; you can redistribute it and/or
 *     modify it under the terms of the GNU Lesser General Public
 *     License as published by the Free Software Foundation; either
 *     version 2.1 of the License, or (at your option) any later version.
 *
 *     This library is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public
 *     License along with this library; if not, write to the Free Software
 *     Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 *     USA
 *
 *     Please contact Rosemoe by email 2073412493@qq.com if you need
 *     additional information or have any questions
 */
package io.github.rosemoe.sora.lang.styling.color;

import android.graphics.Color;

import androidx.annotation.NonNull;

import io.github.rosemoe.sora.widget.CodeEditor;

/**
 * An implementation of {@link ResolvableColor} containing a constant color
 *
 * @author Rosemoe
 */
public class ConstColor implements ResolvableColor {

    private final int color;

    /**
     * @param color Color int
     */
    public ConstColor(int color) {
        this.color = color;
    }

    /**
     * @param color Hex color string
     * @see Color#parseColor(String)
     */
    public ConstColor(String color) {
        this.color = Color.parseColor(color);
    }

    @Override
    public int resolve(@NonNull CodeEditor editor) {
        return color;
    }
}
