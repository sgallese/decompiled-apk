package com.habitrpg.android.habitica.ui.views.ads;

import ad.a1;
import ad.i;
import ad.x1;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.AdButtonBinding;
import com.habitrpg.android.habitica.extensions.DateExtensionsKt;
import com.habitrpg.android.habitica.helpers.AdHandler;
import com.habitrpg.android.habitica.helpers.AdType;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.Date;
import jc.a;
import jc.b;
import qc.h;
import qc.q;

/* compiled from: AdButton.kt */
/* loaded from: classes4.dex */
public final class AdButton extends LinearLayout {
    public static final int $stable = 8;
    private int activeBackgroundRes;
    private final AdButtonBinding binding;
    private Date nextAdDate;
    private State state;
    private String text;
    private x1 updateJob;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdButton.kt */
    /* loaded from: classes4.dex */
    public static final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State EMPTY = new State("EMPTY", 0);
        public static final State READY = new State("READY", 1);
        public static final State LOADING = new State("LOADING", 2);
        public static final State UNAVAILABLE = new State("UNAVAILABLE", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{EMPTY, READY, LOADING, UNAVAILABLE};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private State(String str, int i10) {
        }

        public static a<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: AdButton.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.LOADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.util.AttributeSet, qc.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdButton(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            qc.q.i(r3, r0)
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.ads.AdButton.<init>(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViews() {
        String str;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        this.binding.loadingIndicator.setVisibility(0);
                        this.binding.textView.setVisibility(8);
                        this.binding.currencyView.setVisibility(8);
                    }
                } else {
                    this.binding.loadingIndicator.setVisibility(8);
                    this.binding.textView.setVisibility(8);
                    this.binding.currencyView.setVisibility(8);
                }
            } else {
                this.binding.loadingIndicator.setVisibility(8);
                TextView textView = this.binding.textView;
                Context context = getContext();
                Object[] objArr = new Object[1];
                Date date = this.nextAdDate;
                if (date == null || (str = DateExtensionsKt.getShortRemainingString(date)) == null) {
                    str = "";
                }
                objArr[0] = str;
                textView.setText(context.getString(R.string.available_in, objArr));
                this.binding.textView.setAlpha(0.75f);
                this.binding.textView.setVisibility(0);
                this.binding.currencyView.setVisibility(8);
                setBackgroundResource(R.drawable.ad_button_background_disabled);
            }
        } else {
            this.binding.loadingIndicator.setVisibility(8);
            this.binding.textView.setText(this.text);
            this.binding.textView.setAlpha(1.0f);
            this.binding.textView.setVisibility(0);
            this.binding.currencyView.setVisibility(0);
            setBackgroundResource(this.activeBackgroundRes);
        }
        if (this.state != State.READY) {
            z10 = false;
        }
        setEnabled(z10);
    }

    public final State getState() {
        return this.state;
    }

    public final String getText() {
        return this.text;
    }

    public final void setState(State state) {
        q.i(state, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.state = state;
        updateViews();
    }

    public final void setText(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.text = str;
        updateViews();
    }

    public final void updateForAdType(AdType adType, androidx.lifecycle.q qVar) {
        boolean z10;
        x1 d10;
        x1 x1Var;
        q.i(adType, TaskFormActivity.TASK_TYPE_KEY);
        q.i(qVar, "lifecycleScope");
        x1 x1Var2 = this.updateJob;
        boolean z11 = false;
        if (x1Var2 != null && x1Var2.b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (x1Var = this.updateJob) != null) {
            x1.a.a(x1Var, null, 1, null);
        }
        Date nextAdAllowedDate = AdHandler.Companion.nextAdAllowedDate(adType);
        this.nextAdDate = nextAdAllowedDate;
        if (nextAdAllowedDate != null && nextAdAllowedDate.after(new Date())) {
            z11 = true;
        }
        if (z11) {
            d10 = i.d(qVar, a1.c(), null, new AdButton$updateForAdType$1(this, null), 2, null);
            this.updateJob = d10;
        }
    }

    public /* synthetic */ AdButton(Context context, AttributeSet attributeSet, int i10, h hVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
    
        if ((!r10) == true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdButton(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            java.lang.String r0 = "context"
            qc.q.i(r10, r0)
            r9.<init>(r10, r11)
            com.habitrpg.android.habitica.ui.views.ads.AdButton$State r0 = com.habitrpg.android.habitica.ui.views.ads.AdButton.State.READY
            r9.state = r0
            android.view.LayoutInflater r1 = com.habitrpg.common.habitica.extensions.ContextExtensionsKt.getLayoutInflater(r10)
            com.habitrpg.android.habitica.databinding.AdButtonBinding r1 = com.habitrpg.android.habitica.databinding.AdButtonBinding.inflate(r1, r9)
            java.lang.String r2 = "inflate(...)"
            qc.q.h(r1, r2)
            r9.binding = r1
            r2 = 2131230845(0x7f08007d, float:1.8077754E38)
            r9.activeBackgroundRes = r2
            java.lang.String r3 = ""
            r9.text = r3
            android.content.res.Resources$Theme r4 = r10.getTheme()
            r5 = 2131100684(0x7f06040c, float:1.7813756E38)
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L63
            int[] r8 = com.habitrpg.android.habitica.R.styleable.AdButton
            android.content.res.TypedArray r11 = r4.obtainStyledAttributes(r11, r8, r7, r7)
            if (r11 == 0) goto L63
            r4 = 2
            java.lang.String r4 = r11.getString(r4)
            if (r4 != 0) goto L3f
            goto L43
        L3f:
            qc.q.f(r4)
            r3 = r4
        L43:
            r9.setText(r3)
            com.habitrpg.android.habitica.ui.views.CurrencyView r3 = r1.currencyView
            java.lang.String r4 = r11.getString(r6)
            r3.setCurrency(r4)
            int r2 = r11.getResourceId(r7, r2)
            r9.activeBackgroundRes = r2
            android.widget.TextView r2 = r1.textView
            r3 = 3
            int r4 = androidx.core.content.a.c(r10, r5)
            int r11 = r11.getColor(r3, r4)
            r2.setTextColor(r11)
        L63:
            com.habitrpg.android.habitica.ui.views.CurrencyView r11 = r1.currencyView
            int r10 = androidx.core.content.a.c(r10, r5)
            r11.setTextColor(r10)
            com.habitrpg.android.habitica.ui.views.CurrencyView r10 = r1.currencyView
            r2 = 0
            r10.setValue(r2)
            com.habitrpg.android.habitica.ui.views.CurrencyView r10 = r1.currencyView
            java.lang.String r10 = r10.getCurrency()
            if (r10 == 0) goto L83
            boolean r10 = yc.m.u(r10)
            r10 = r10 ^ r6
            if (r10 != r6) goto L83
            goto L84
        L83:
            r6 = 0
        L84:
            if (r6 != 0) goto L8d
            com.habitrpg.android.habitica.ui.views.CurrencyView r10 = r1.currencyView
            r11 = 8
            r10.setVisibility(r11)
        L8d:
            r10 = 17
            r9.setGravity(r10)
            r9.setState(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.ads.AdButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }
}
