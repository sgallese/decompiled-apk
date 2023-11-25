package com.habitrpg.android.habitica.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.databinding.NpcBannerBinding;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.DataBindingUtils;
import qc.q;
import yc.v;

/* compiled from: NPCBannerView.kt */
/* loaded from: classes4.dex */
public final class NPCBannerView extends FrameLayout {
    public static final int $stable = 8;
    private final NpcBannerBinding binding;
    private String identifier;
    private String shopSpriteSuffix;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NPCBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        NpcBannerBinding inflate = NpcBannerBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        this.shopSpriteSuffix = "";
        this.identifier = "";
    }

    private final void setImage() {
        DataBindingUtils dataBindingUtils = DataBindingUtils.INSTANCE;
        Context context = getContext();
        q.h(context, "getContext(...)");
        dataBindingUtils.loadImage(context, this.identifier + "_scene" + this.shopSpriteSuffix, new NPCBannerView$setImage$1(this));
        this.binding.backgroundView.setScaleType(ImageView.ScaleType.FIT_START);
        Context context2 = getContext();
        q.h(context2, "getContext(...)");
        dataBindingUtils.loadImage(context2, this.identifier + "_background" + this.shopSpriteSuffix, new NPCBannerView$setImage$2(this));
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getShopSpriteSuffix() {
        return this.shopSpriteSuffix;
    }

    public final void setIdentifier(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.identifier = str;
        setImage();
    }

    public final void setShopSpriteSuffix(String str) {
        boolean z10;
        boolean F;
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        boolean z11 = true;
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            F = v.F(str, "_", false, 2, null);
            if (!F) {
                str = "_" + str;
            }
        }
        this.shopSpriteSuffix = str;
        if (this.identifier.length() <= 0) {
            z11 = false;
        }
        if (z11) {
            setImage();
        }
    }
}
