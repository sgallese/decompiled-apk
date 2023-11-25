package com.habitrpg.android.habitica.ui.views.subscriptions;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.SubscriptionDetailsBinding;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import dc.w;
import java.util.Date;
import qc.q;

/* compiled from: SubscriptionDetailsView.kt */
/* loaded from: classes4.dex */
public final class SubscriptionDetailsView extends LinearLayout {
    public static final int $stable = 8;
    public SubscriptionDetailsBinding binding;
    private String currentUserID;
    private pc.a<w> onShowSubscriptionOptions;
    private SubscriptionPlan plan;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionDetailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        q.i(attributeSet, "attributeSet");
        setupView();
    }

    private final void changeSubscriptionButtonTapped() {
        String str;
        pc.a<w> aVar;
        Date date;
        String str2;
        SubscriptionPlan subscriptionPlan = this.plan;
        Object obj = null;
        if (subscriptionPlan != null) {
            str = subscriptionPlan.getPaymentMethod();
        } else {
            str = null;
        }
        if (str != null) {
            SubscriptionPlan subscriptionPlan2 = this.plan;
            if (subscriptionPlan2 != null) {
                date = subscriptionPlan2.realmGet$dateTerminated();
            } else {
                date = null;
            }
            if (date == null) {
                SubscriptionPlan subscriptionPlan3 = this.plan;
                if (subscriptionPlan3 != null) {
                    obj = subscriptionPlan3.getPaymentMethod();
                }
                if (q.d(obj, "Google")) {
                    str2 = "https://play.google.com/store/account/subscriptions";
                } else {
                    str2 = getContext().getString(R.string.base_url) + "/";
                }
                getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                return;
            }
        }
        SubscriptionPlan subscriptionPlan4 = this.plan;
        if (subscriptionPlan4 != null) {
            obj = subscriptionPlan4.realmGet$dateTerminated();
        }
        if (obj != null && (aVar = this.onShowSubscriptionOptions) != null) {
            aVar.invoke();
        }
    }

    private final void setupView() {
        Context context = getContext();
        q.h(context, "getContext(...)");
        SubscriptionDetailsBinding inflate = SubscriptionDetailsBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this, true);
        q.h(inflate, "inflate(...)");
        setBinding(inflate);
        getBinding().changeSubscriptionButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.subscriptions.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubscriptionDetailsView.setupView$lambda$0(SubscriptionDetailsView.this, view);
            }
        });
        getBinding().heartIcon.setImageDrawable(new BitmapDrawable(getContext().getResources(), HabiticaIconsHelper.imageOfHeartLightBg()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupView$lambda$0(SubscriptionDetailsView subscriptionDetailsView, View view) {
        q.i(subscriptionDetailsView, "this$0");
        subscriptionDetailsView.changeSubscriptionButtonTapped();
    }

    private final void updateSubscriptionStatusPill(SubscriptionPlan subscriptionPlan) {
        if (subscriptionPlan.isActive()) {
            if (subscriptionPlan.realmGet$dateTerminated() != null) {
                if (subscriptionPlan.isGiftedSub()) {
                    getBinding().subscriptionStatusNotRecurring.setVisibility(0);
                    getBinding().subscriptionStatusCancelled.setVisibility(8);
                } else {
                    getBinding().subscriptionStatusNotRecurring.setVisibility(8);
                    getBinding().subscriptionStatusCancelled.setVisibility(0);
                }
                getBinding().subscriptionStatusActive.setVisibility(8);
                getBinding().subscriptionStatusGroupPlan.setVisibility(8);
            } else if (subscriptionPlan.isGroupPlanSub()) {
                getBinding().subscriptionStatusGroupPlan.setVisibility(0);
                getBinding().subscriptionStatusActive.setVisibility(8);
                getBinding().subscriptionStatusNotRecurring.setVisibility(8);
            } else {
                getBinding().subscriptionStatusActive.setVisibility(0);
                getBinding().subscriptionStatusNotRecurring.setVisibility(8);
                getBinding().subscriptionStatusGroupPlan.setVisibility(8);
            }
            getBinding().subscriptionStatusInactive.setVisibility(8);
            return;
        }
        getBinding().subscriptionStatusActive.setVisibility(8);
        getBinding().subscriptionStatusInactive.setVisibility(0);
        getBinding().subscriptionStatusNotRecurring.setVisibility(8);
        getBinding().subscriptionStatusGroupPlan.setVisibility(8);
    }

    public final SubscriptionDetailsBinding getBinding() {
        SubscriptionDetailsBinding subscriptionDetailsBinding = this.binding;
        if (subscriptionDetailsBinding != null) {
            return subscriptionDetailsBinding;
        }
        q.z("binding");
        return null;
    }

    public final String getCurrentUserID() {
        return this.currentUserID;
    }

    public final pc.a<w> getOnShowSubscriptionOptions() {
        return this.onShowSubscriptionOptions;
    }

    public final void setBinding(SubscriptionDetailsBinding subscriptionDetailsBinding) {
        q.i(subscriptionDetailsBinding, "<set-?>");
        this.binding = subscriptionDetailsBinding;
    }

    public final void setCurrentUserID(String str) {
        this.currentUserID = str;
    }

    public final void setOnShowSubscriptionOptions(pc.a<w> aVar) {
        this.onShowSubscriptionOptions = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:107:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPlan(com.habitrpg.android.habitica.models.user.SubscriptionPlan r9) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.subscriptions.SubscriptionDetailsView.setPlan(com.habitrpg.android.habitica.models.user.SubscriptionPlan):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionDetailsView(Context context) {
        super(context);
        q.i(context, "context");
        setupView();
    }
}
