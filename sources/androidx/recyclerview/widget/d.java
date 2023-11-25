package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* compiled from: BatchingListUpdateCallback.java */
/* loaded from: classes.dex */
public class d implements r {

    /* renamed from: a  reason: collision with root package name */
    final r f6702a;

    /* renamed from: b  reason: collision with root package name */
    int f6703b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f6704c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f6705d = -1;

    /* renamed from: e  reason: collision with root package name */
    Object f6706e = null;

    public d(r rVar) {
        this.f6702a = rVar;
    }

    @Override // androidx.recyclerview.widget.r
    public void a(int i10, int i11) {
        int i12;
        if (this.f6703b == 1 && i10 >= (i12 = this.f6704c)) {
            int i13 = this.f6705d;
            if (i10 <= i12 + i13) {
                this.f6705d = i13 + i11;
                this.f6704c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.f6704c = i10;
        this.f6705d = i11;
        this.f6703b = 1;
    }

    @Override // androidx.recyclerview.widget.r
    public void b(int i10, int i11) {
        int i12;
        if (this.f6703b == 2 && (i12 = this.f6704c) >= i10 && i12 <= i10 + i11) {
            this.f6705d += i11;
            this.f6704c = i10;
            return;
        }
        e();
        this.f6704c = i10;
        this.f6705d = i11;
        this.f6703b = 2;
    }

    @Override // androidx.recyclerview.widget.r
    public void c(int i10, int i11) {
        e();
        this.f6702a.c(i10, i11);
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public void d(int i10, int i11, Object obj) {
        int i12;
        if (this.f6703b == 3) {
            int i13 = this.f6704c;
            int i14 = this.f6705d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f6706e == obj) {
                this.f6704c = Math.min(i10, i13);
                this.f6705d = Math.max(i14 + i13, i12) - this.f6704c;
                return;
            }
        }
        e();
        this.f6704c = i10;
        this.f6705d = i11;
        this.f6706e = obj;
        this.f6703b = 3;
    }

    public void e() {
        int i10 = this.f6703b;
        if (i10 == 0) {
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f6702a.d(this.f6704c, this.f6705d, this.f6706e);
                }
            } else {
                this.f6702a.b(this.f6704c, this.f6705d);
            }
        } else {
            this.f6702a.a(this.f6704c, this.f6705d);
        }
        this.f6706e = null;
        this.f6703b = 0;
    }
}
