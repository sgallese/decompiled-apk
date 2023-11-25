package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutState.java */
/* loaded from: classes.dex */
class p {

    /* renamed from: b  reason: collision with root package name */
    int f6915b;

    /* renamed from: c  reason: collision with root package name */
    int f6916c;

    /* renamed from: d  reason: collision with root package name */
    int f6917d;

    /* renamed from: e  reason: collision with root package name */
    int f6918e;

    /* renamed from: h  reason: collision with root package name */
    boolean f6921h;

    /* renamed from: i  reason: collision with root package name */
    boolean f6922i;

    /* renamed from: a  reason: collision with root package name */
    boolean f6914a = true;

    /* renamed from: f  reason: collision with root package name */
    int f6919f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f6920g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(RecyclerView.b0 b0Var) {
        int i10 = this.f6916c;
        if (i10 >= 0 && i10 < b0Var.b()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View b(RecyclerView.w wVar) {
        View o10 = wVar.o(this.f6916c);
        this.f6916c += this.f6917d;
        return o10;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f6915b + ", mCurrentPosition=" + this.f6916c + ", mItemDirection=" + this.f6917d + ", mLayoutDirection=" + this.f6918e + ", mStartLine=" + this.f6919f + ", mEndLine=" + this.f6920g + '}';
    }
}
