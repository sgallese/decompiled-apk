package com.habitrpg.android.habitica.ui.views;

import android.graphics.DashPathEffect;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HabiticaIcons.java */
/* loaded from: classes4.dex */
public class PaintCodeDashPathEffect {
    private float dash;
    private DashPathEffect effect;
    private float gap;
    private float phase;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DashPathEffect get(float f10) {
        if (this.dash != f10 || this.gap != 20.0f || this.phase != 0.0f) {
            this.dash = f10;
            this.gap = 20.0f;
            this.phase = 0.0f;
            this.effect = new DashPathEffect(new float[]{f10, 20.0f}, 0.0f);
        }
        return this.effect;
    }
}
