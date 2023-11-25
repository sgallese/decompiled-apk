package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ItemTouchUIUtilImpl.java */
/* loaded from: classes.dex */
public class o implements n {

    /* renamed from: a  reason: collision with root package name */
    static final n f6913a = new o();

    o() {
    }

    private static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (childAt != view) {
                float y10 = p0.y(childAt);
                if (y10 > f10) {
                    f10 = y10;
                }
            }
        }
        return f10;
    }

    @Override // androidx.recyclerview.widget.n
    public void a(View view) {
        int i10 = t3.c.f23528a;
        Object tag = view.getTag(i10);
        if (tag instanceof Float) {
            p0.C0(view, ((Float) tag).floatValue());
        }
        view.setTag(i10, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.n
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
        if (z10) {
            int i11 = t3.c.f23528a;
            if (view.getTag(i11) == null) {
                Float valueOf = Float.valueOf(p0.y(view));
                p0.C0(view, e(recyclerView, view) + 1.0f);
                view.setTag(i11, valueOf);
            }
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }

    @Override // androidx.recyclerview.widget.n
    public void b(View view) {
    }

    @Override // androidx.recyclerview.widget.n
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
    }
}
