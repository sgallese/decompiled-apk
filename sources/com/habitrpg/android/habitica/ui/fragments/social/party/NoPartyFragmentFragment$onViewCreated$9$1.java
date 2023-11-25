package com.habitrpg.android.habitica.ui.fragments.social.party;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.FragmentNoPartyBinding;
import dc.w;

/* compiled from: NoPartyFragmentFragment.kt */
/* loaded from: classes4.dex */
final class NoPartyFragmentFragment$onViewCreated$9$1 extends qc.r implements pc.l<Drawable, w> {
    final /* synthetic */ Context $context;
    final /* synthetic */ NoPartyFragmentFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoPartyFragmentFragment$onViewCreated$9$1(Context context, NoPartyFragmentFragment noPartyFragmentFragment) {
        super(1);
        this.$context = context;
        this.this$0 = noPartyFragmentFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Drawable drawable) {
        invoke2(drawable);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Drawable drawable) {
        int d10;
        qc.q.i(drawable, "drawable");
        Bitmap b10 = androidx.core.graphics.drawable.b.b(drawable, 0, 0, null, 7, null);
        int dimension = (int) this.$context.getResources().getDimension(R.dimen.shop_height);
        d10 = sc.c.d(dimension * (b10.getWidth() / b10.getHeight()));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.$context.getResources(), Bitmap.createScaledBitmap(b10, d10, dimension, false));
        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        FragmentNoPartyBinding binding = this.this$0.getBinding();
        if ((binding != null ? binding.noPartyBackground : null) != null) {
            FragmentNoPartyBinding binding2 = this.this$0.getBinding();
            ImageView imageView = binding2 != null ? binding2.noPartyBackground : null;
            if (imageView == null) {
                return;
            }
            imageView.setBackground(bitmapDrawable);
        }
    }
}
