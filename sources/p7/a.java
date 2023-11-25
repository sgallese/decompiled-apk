package p7;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AbsoluteCornerSize.java */
/* loaded from: classes3.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f21169a;

    public a(float f10) {
        this.f21169a = f10;
    }

    @Override // p7.c
    public float a(RectF rectF) {
        return this.f21169a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f21169a == ((a) obj).f21169a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f21169a)});
    }
}
