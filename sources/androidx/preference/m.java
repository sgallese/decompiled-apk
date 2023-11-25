package androidx.preference;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.p0;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PreferenceViewHolder.java */
/* loaded from: classes.dex */
public class m extends RecyclerView.f0 {

    /* renamed from: f  reason: collision with root package name */
    private final Drawable f6338f;

    /* renamed from: m  reason: collision with root package name */
    private ColorStateList f6339m;

    /* renamed from: p  reason: collision with root package name */
    private final SparseArray<View> f6340p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6341q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6342r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f6340p = sparseArray;
        TextView textView = (TextView) view.findViewById(16908310);
        sparseArray.put(16908310, textView);
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        int i10 = p.f6356a;
        sparseArray.put(i10, view.findViewById(i10));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.f6338f = view.getBackground();
        if (textView != null) {
            this.f6339m = textView.getTextColors();
        }
    }

    public View a(int i10) {
        View view = this.f6340p.get(i10);
        if (view != null) {
            return view;
        }
        View findViewById = this.itemView.findViewById(i10);
        if (findViewById != null) {
            this.f6340p.put(i10, findViewById);
        }
        return findViewById;
    }

    public boolean b() {
        return this.f6341q;
    }

    public boolean c() {
        return this.f6342r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Drawable background = this.itemView.getBackground();
        Drawable drawable = this.f6338f;
        if (background != drawable) {
            p0.y0(this.itemView, drawable);
        }
        TextView textView = (TextView) a(16908310);
        if (textView != null && this.f6339m != null && !textView.getTextColors().equals(this.f6339m)) {
            textView.setTextColor(this.f6339m);
        }
    }

    public void e(boolean z10) {
        this.f6341q = z10;
    }

    public void f(boolean z10) {
        this.f6342r = z10;
    }
}
