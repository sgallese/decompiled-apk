package p7;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: RelativeCornerSize.java */
/* loaded from: classes3.dex */
public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f21211a;

    public i(float f10) {
        this.f21211a = f10;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // p7.c
    public float a(RectF rectF) {
        return this.f21211a * b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && this.f21211a == ((i) obj).f21211a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f21211a)});
    }
}
