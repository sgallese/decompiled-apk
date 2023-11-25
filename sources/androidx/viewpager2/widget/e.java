package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScrollEventAdapter.java */
/* loaded from: classes.dex */
public final class e extends RecyclerView.u {

    /* renamed from: a  reason: collision with root package name */
    private ViewPager2.i f7366a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewPager2 f7367b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView f7368c;

    /* renamed from: d  reason: collision with root package name */
    private final LinearLayoutManager f7369d;

    /* renamed from: e  reason: collision with root package name */
    private int f7370e;

    /* renamed from: f  reason: collision with root package name */
    private int f7371f;

    /* renamed from: g  reason: collision with root package name */
    private a f7372g;

    /* renamed from: h  reason: collision with root package name */
    private int f7373h;

    /* renamed from: i  reason: collision with root package name */
    private int f7374i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f7375j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7376k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7377l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7378m;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollEventAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f7379a;

        /* renamed from: b  reason: collision with root package name */
        float f7380b;

        /* renamed from: c  reason: collision with root package name */
        int f7381c;

        a() {
        }

        void a() {
            this.f7379a = -1;
            this.f7380b = 0.0f;
            this.f7381c = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(ViewPager2 viewPager2) {
        this.f7367b = viewPager2;
        RecyclerView recyclerView = viewPager2.f7334w;
        this.f7368c = recyclerView;
        this.f7369d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f7372g = new a();
        l();
    }

    private void a(int i10, float f10, int i11) {
        ViewPager2.i iVar = this.f7366a;
        if (iVar != null) {
            iVar.onPageScrolled(i10, f10, i11);
        }
    }

    private void b(int i10) {
        ViewPager2.i iVar = this.f7366a;
        if (iVar != null) {
            iVar.onPageSelected(i10);
        }
    }

    private void c(int i10) {
        if ((this.f7370e == 3 && this.f7371f == 0) || this.f7371f == i10) {
            return;
        }
        this.f7371f = i10;
        ViewPager2.i iVar = this.f7366a;
        if (iVar != null) {
            iVar.onPageScrollStateChanged(i10);
        }
    }

    private int d() {
        return this.f7369d.i2();
    }

    private boolean i() {
        int i10 = this.f7370e;
        if (i10 == 1 || i10 == 4) {
            return true;
        }
        return false;
    }

    private void l() {
        this.f7370e = 0;
        this.f7371f = 0;
        this.f7372g.a();
        this.f7373h = -1;
        this.f7374i = -1;
        this.f7375j = false;
        this.f7376k = false;
        this.f7378m = false;
        this.f7377l = false;
    }

    private void n(boolean z10) {
        int i10;
        this.f7378m = z10;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        this.f7370e = i10;
        int i11 = this.f7374i;
        if (i11 != -1) {
            this.f7373h = i11;
            this.f7374i = -1;
        } else if (this.f7373h == -1) {
            this.f7373h = d();
        }
        c(1);
    }

    private void o() {
        boolean z10;
        int top;
        float f10;
        a aVar = this.f7372g;
        int i22 = this.f7369d.i2();
        aVar.f7379a = i22;
        if (i22 == -1) {
            aVar.a();
            return;
        }
        View O = this.f7369d.O(i22);
        if (O == null) {
            aVar.a();
            return;
        }
        int m02 = this.f7369d.m0(O);
        int r02 = this.f7369d.r0(O);
        int u02 = this.f7369d.u0(O);
        int T = this.f7369d.T(O);
        ViewGroup.LayoutParams layoutParams = O.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            m02 += marginLayoutParams.leftMargin;
            r02 += marginLayoutParams.rightMargin;
            u02 += marginLayoutParams.topMargin;
            T += marginLayoutParams.bottomMargin;
        }
        int height = O.getHeight() + u02 + T;
        int width = O.getWidth() + m02 + r02;
        if (this.f7369d.v2() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            top = (O.getLeft() - m02) - this.f7368c.getPaddingLeft();
            if (this.f7367b.d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (O.getTop() - u02) - this.f7368c.getPaddingTop();
        }
        int i10 = -top;
        aVar.f7381c = i10;
        if (i10 < 0) {
            if (new androidx.viewpager2.widget.a(this.f7369d).d()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f7381c)));
        }
        if (height == 0) {
            f10 = 0.0f;
        } else {
            f10 = i10 / height;
        }
        aVar.f7380b = f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double e() {
        o();
        a aVar = this.f7372g;
        return aVar.f7379a + aVar.f7380b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f7371f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.f7378m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        if (this.f7371f == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        this.f7377l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(int i10, boolean z10) {
        int i11;
        if (z10) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f7370e = i11;
        boolean z11 = false;
        this.f7378m = false;
        if (this.f7374i != i10) {
            z11 = true;
        }
        this.f7374i = i10;
        c(2);
        if (z11) {
            b(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(ViewPager2.i iVar) {
        this.f7366a = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        boolean z10 = true;
        if ((this.f7370e != 1 || this.f7371f != 1) && i10 == 1) {
            n(false);
        } else if (i() && i10 == 2) {
            if (this.f7376k) {
                c(2);
                this.f7375j = true;
            }
        } else {
            if (i() && i10 == 0) {
                o();
                if (!this.f7376k) {
                    int i11 = this.f7372g.f7379a;
                    if (i11 != -1) {
                        a(i11, 0.0f, 0);
                    }
                } else {
                    a aVar = this.f7372g;
                    if (aVar.f7381c == 0) {
                        int i12 = this.f7373h;
                        int i13 = aVar.f7379a;
                        if (i12 != i13) {
                            b(i13);
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    c(0);
                    l();
                }
            }
            if (this.f7370e == 2 && i10 == 0 && this.f7377l) {
                o();
                a aVar2 = this.f7372g;
                if (aVar2.f7381c == 0) {
                    int i14 = this.f7374i;
                    int i15 = aVar2.f7379a;
                    if (i14 != i15) {
                        if (i15 == -1) {
                            i15 = 0;
                        }
                        b(i15);
                    }
                    c(0);
                    l();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r5 == r3.f7367b.d()) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f7376k = r4
            r3.o()
            boolean r0 = r3.f7375j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L3d
            r3.f7375j = r2
            if (r6 > 0) goto L22
            if (r6 != 0) goto L20
            if (r5 >= 0) goto L16
            r5 = 1
            goto L17
        L16:
            r5 = 0
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f7367b
            boolean r6 = r6.d()
            if (r5 != r6) goto L20
            goto L22
        L20:
            r5 = 0
            goto L23
        L22:
            r5 = 1
        L23:
            if (r5 == 0) goto L2f
            androidx.viewpager2.widget.e$a r5 = r3.f7372g
            int r6 = r5.f7381c
            if (r6 == 0) goto L2f
            int r5 = r5.f7379a
            int r5 = r5 + r4
            goto L33
        L2f:
            androidx.viewpager2.widget.e$a r5 = r3.f7372g
            int r5 = r5.f7379a
        L33:
            r3.f7374i = r5
            int r6 = r3.f7373h
            if (r6 == r5) goto L4b
            r3.b(r5)
            goto L4b
        L3d:
            int r5 = r3.f7370e
            if (r5 != 0) goto L4b
            androidx.viewpager2.widget.e$a r5 = r3.f7372g
            int r5 = r5.f7379a
            if (r5 != r1) goto L48
            r5 = 0
        L48:
            r3.b(r5)
        L4b:
            androidx.viewpager2.widget.e$a r5 = r3.f7372g
            int r6 = r5.f7379a
            if (r6 != r1) goto L52
            r6 = 0
        L52:
            float r0 = r5.f7380b
            int r5 = r5.f7381c
            r3.a(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f7372g
            int r6 = r5.f7379a
            int r0 = r3.f7374i
            if (r6 == r0) goto L63
            if (r0 != r1) goto L71
        L63:
            int r5 = r5.f7381c
            if (r5 != 0) goto L71
            int r5 = r3.f7371f
            if (r5 == r4) goto L71
            r3.c(r2)
            r3.l()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.e.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
