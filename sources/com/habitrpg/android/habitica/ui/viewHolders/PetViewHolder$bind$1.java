package com.habitrpg.android.habitica.ui.viewHolders;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.habitrpg.android.habitica.databinding.PetDetailItemBinding;
import dc.w;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PetViewHolder.kt */
/* loaded from: classes4.dex */
public final class PetViewHolder$bind$1 extends r implements pc.l<Drawable, w> {
    final /* synthetic */ boolean $canRaiseToMount;
    final /* synthetic */ String $imageName;
    final /* synthetic */ int $trained;
    final /* synthetic */ PetViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetViewHolder$bind$1(PetViewHolder petViewHolder, int i10, boolean z10, String str) {
        super(1);
        this.this$0 = petViewHolder;
        this.$trained = i10;
        this.$canRaiseToMount = z10;
        this.$imageName = str;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Drawable drawable) {
        invoke2(drawable);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Drawable drawable) {
        PetDetailItemBinding petDetailItemBinding;
        PetDetailItemBinding petDetailItemBinding2;
        q.i(drawable, "it");
        Resources resources = this.this$0.itemView.getContext().getResources();
        if (resources == null) {
            return;
        }
        BitmapDrawable bitmapDrawable = (this.$trained == 0 && this.$canRaiseToMount) ? new BitmapDrawable(resources, androidx.core.graphics.drawable.b.b(drawable, 0, 0, null, 7, null).extractAlpha()) : drawable;
        petDetailItemBinding = this.this$0.binding;
        if (q.d(petDetailItemBinding.imageView.getTag(), this.$imageName)) {
            petDetailItemBinding2 = this.this$0.binding;
            petDetailItemBinding2.imageView.setBitmap(androidx.core.graphics.drawable.b.b(bitmapDrawable, 0, 0, null, 7, null));
        }
    }
}
