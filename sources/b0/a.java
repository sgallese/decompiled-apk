package b0;

import a1.q4;
import a1.z3;
import com.habitrpg.android.habitica.models.tasks.Task;
import j2.r;
import qc.q;
import z0.l;

/* compiled from: CornerBasedShape.kt */
/* loaded from: classes.dex */
public abstract class a implements q4 {

    /* renamed from: a  reason: collision with root package name */
    private final b f7618a;

    /* renamed from: b  reason: collision with root package name */
    private final b f7619b;

    /* renamed from: c  reason: collision with root package name */
    private final b f7620c;

    /* renamed from: d  reason: collision with root package name */
    private final b f7621d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        q.i(bVar, "topStart");
        q.i(bVar2, "topEnd");
        q.i(bVar3, "bottomEnd");
        q.i(bVar4, "bottomStart");
        this.f7618a = bVar;
        this.f7619b = bVar2;
        this.f7620c = bVar3;
        this.f7621d = bVar4;
    }

    public static /* synthetic */ a d(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                bVar = aVar.f7618a;
            }
            if ((i10 & 2) != 0) {
                bVar2 = aVar.f7619b;
            }
            if ((i10 & 4) != 0) {
                bVar3 = aVar.f7620c;
            }
            if ((i10 & 8) != 0) {
                bVar4 = aVar.f7621d;
            }
            return aVar.c(bVar, bVar2, bVar3, bVar4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    @Override // a1.q4
    public final z3 a(long j10, r rVar, j2.e eVar) {
        boolean z10;
        q.i(rVar, "layoutDirection");
        q.i(eVar, "density");
        float a10 = this.f7618a.a(j10, eVar);
        float a11 = this.f7619b.a(j10, eVar);
        float a12 = this.f7620c.a(j10, eVar);
        float a13 = this.f7621d.a(j10, eVar);
        float h10 = l.h(j10);
        float f10 = a10 + a13;
        if (f10 > h10) {
            float f11 = h10 / f10;
            a10 *= f11;
            a13 *= f11;
        }
        float f12 = a13;
        float f13 = a11 + a12;
        if (f13 > h10) {
            float f14 = h10 / f13;
            a11 *= f14;
            a12 *= f14;
        }
        if (a10 >= 0.0f && a11 >= 0.0f && a12 >= 0.0f && f12 >= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return e(j10, a10, a11, a12, f12, rVar);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a10 + ", topEnd = " + a11 + ", bottomEnd = " + a12 + ", bottomStart = " + f12 + ")!").toString());
    }

    public final a b(b bVar) {
        q.i(bVar, Task.FILTER_ALL);
        return c(bVar, bVar, bVar, bVar);
    }

    public abstract a c(b bVar, b bVar2, b bVar3, b bVar4);

    public abstract z3 e(long j10, float f10, float f11, float f12, float f13, r rVar);

    public final b f() {
        return this.f7620c;
    }

    public final b g() {
        return this.f7621d;
    }

    public final b h() {
        return this.f7619b;
    }

    public final b i() {
        return this.f7618a;
    }
}
