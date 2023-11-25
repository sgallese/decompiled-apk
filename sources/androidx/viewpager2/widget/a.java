package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimateLayoutChangeDetector.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f7358b;

    /* renamed from: a  reason: collision with root package name */
    private LinearLayoutManager f7359a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimateLayoutChangeDetector.java */
    /* renamed from: androidx.viewpager2.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0165a implements Comparator<int[]> {
        C0165a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f7358b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(LinearLayoutManager linearLayoutManager) {
        this.f7359a = linearLayoutManager;
    }

    private boolean a() {
        boolean z10;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        int i10;
        int bottom;
        int i11;
        int V = this.f7359a.V();
        if (V == 0) {
            return true;
        }
        if (this.f7359a.v2() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, V, 2);
        for (int i12 = 0; i12 < V; i12++) {
            View U = this.f7359a.U(i12);
            if (U != null) {
                ViewGroup.LayoutParams layoutParams = U.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f7358b;
                }
                int[] iArr2 = iArr[i12];
                if (z10) {
                    top = U.getLeft();
                    i10 = marginLayoutParams.leftMargin;
                } else {
                    top = U.getTop();
                    i10 = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i10;
                int[] iArr3 = iArr[i12];
                if (z10) {
                    bottom = U.getRight();
                    i11 = marginLayoutParams.rightMargin;
                } else {
                    bottom = U.getBottom();
                    i11 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i11;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr, new C0165a());
        for (int i13 = 1; i13 < V; i13++) {
            if (iArr[i13 - 1][1] != iArr[i13][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i14 = iArr4[1];
        int i15 = iArr4[0];
        int i16 = i14 - i15;
        if (i15 <= 0 && iArr[V - 1][1] >= i16) {
            return true;
        }
        return false;
    }

    private boolean b() {
        int V = this.f7359a.V();
        for (int i10 = 0; i10 < V; i10++) {
            if (c(this.f7359a.U(i10))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (c(viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        if ((!a() || this.f7359a.V() <= 1) && b()) {
            return true;
        }
        return false;
    }
}
