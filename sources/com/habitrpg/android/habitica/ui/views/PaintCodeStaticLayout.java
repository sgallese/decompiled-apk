package com.habitrpg.android.habitica.ui.views;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HabiticaIcons.java */
/* loaded from: classes4.dex */
public class PaintCodeStaticLayout {
    private Layout.Alignment alignment;
    private StaticLayout layout;
    private TextPaint paint;
    private CharSequence source;
    private int width;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StaticLayout get(int i10, CharSequence charSequence, TextPaint textPaint) {
        if (this.layout == null || this.width != i10 || this.alignment != Layout.Alignment.ALIGN_CENTER || !this.source.equals(charSequence) || !this.paint.equals(textPaint)) {
            this.width = i10;
            this.alignment = Layout.Alignment.ALIGN_CENTER;
            this.source = charSequence;
            this.paint = textPaint;
            this.layout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        return this.layout;
    }
}
