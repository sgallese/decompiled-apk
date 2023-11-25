package com.habitrpg.android.habitica.ui.views.promo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.core.os.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.l;
import qc.h;
import qc.q;

/* compiled from: SubscriptionBuyGemsPromoView.kt */
/* loaded from: classes4.dex */
public final class SubscriptionBuyGemsPromoView extends RelativeLayout {
    public static final int $stable = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionBuyGemsPromoView(Context context) {
        this(context, null, 0, 6, null);
        q.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(View view) {
        MainNavigationController.INSTANCE.navigate(R.id.gemPurchaseActivity, e.a(new l("openSubscription", Boolean.TRUE)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionBuyGemsPromoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.i(context, "context");
    }

    public /* synthetic */ SubscriptionBuyGemsPromoView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionBuyGemsPromoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.i(context, "context");
        ViewGroupExt.inflate(this, R.layout.promo_subscription_buy_gems, true);
        setBackgroundColor(ContextExtensionsKt.getThemeColor(context, R.attr.colorWindowBackground));
        setClipToPadding(false);
        setClipChildren(false);
        setClipToOutline(false);
        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.promo.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubscriptionBuyGemsPromoView._init_$lambda$0(view);
            }
        });
    }
}
