package p7;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
/* loaded from: classes3.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final c f21170a;

    /* renamed from: b  reason: collision with root package name */
    private final float f21171b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f21170a;
            f10 += ((b) cVar).f21171b;
        }
        this.f21170a = cVar;
        this.f21171b = f10;
    }

    @Override // p7.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f21170a.a(rectF) + this.f21171b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f21170a.equals(bVar.f21170a) && this.f21171b == bVar.f21171b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21170a, Float.valueOf(this.f21171b)});
    }
}
