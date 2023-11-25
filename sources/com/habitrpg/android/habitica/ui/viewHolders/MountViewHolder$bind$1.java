package com.habitrpg.android.habitica.ui.viewHolders;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.habitrpg.android.habitica.databinding.MountOverviewItemBinding;
import dc.w;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MountViewHolder.kt */
/* loaded from: classes4.dex */
public final class MountViewHolder$bind$1 extends r implements pc.l<Drawable, w> {
    final /* synthetic */ String $imageName;
    final /* synthetic */ boolean $owned;
    final /* synthetic */ MountViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MountViewHolder$bind$1(boolean z10, MountViewHolder mountViewHolder, String str) {
        super(1);
        this.$owned = z10;
        this.this$0 = mountViewHolder;
        this.$imageName = str;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Drawable drawable) {
        invoke2(drawable);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Drawable drawable) {
        MountOverviewItemBinding mountOverviewItemBinding;
        MountOverviewItemBinding mountOverviewItemBinding2;
        q.i(drawable, "it");
        BitmapDrawable bitmapDrawable = this.$owned ? drawable : new BitmapDrawable(this.this$0.itemView.getContext().getResources(), androidx.core.graphics.drawable.b.b(drawable, 0, 0, null, 7, null).extractAlpha());
        mountOverviewItemBinding = this.this$0.binding;
        if (q.d(mountOverviewItemBinding.imageView.getTag(), this.$imageName)) {
            mountOverviewItemBinding2 = this.this$0.binding;
            mountOverviewItemBinding2.imageView.setBitmap(androidx.core.graphics.drawable.b.b(bitmapDrawable, 0, 0, null, 7, null));
        }
    }
}
