package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.p0;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentViewHolder.java */
/* loaded from: classes.dex */
public final class a extends RecyclerView.f0 {
    private a(FrameLayout frameLayout) {
        super(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(p0.m());
        frameLayout.setSaveEnabled(false);
        return new a(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FrameLayout b() {
        return (FrameLayout) this.itemView;
    }
}
