package com.habitrpg.android.habitica.ui.views;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.p0;
import androidx.recyclerview.widget.m;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.SnackbarViewBinding;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.common.habitica.helpers.Animations;
import qc.q;

/* compiled from: HabiticaSnackbar.kt */
/* loaded from: classes4.dex */
public final class HabiticaSnackbar extends BaseTransientBottomBar<HabiticaSnackbar> {
    public static final int MIN_LEVEL_FOR_SKILLS = 11;
    private final SnackbarViewBinding binding;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: HabiticaSnackbar.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {

        /* compiled from: HabiticaSnackbar.kt */
        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SnackbarDisplayType.values().length];
                try {
                    iArr[SnackbarDisplayType.FAILURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SnackbarDisplayType.BLACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SnackbarDisplayType.FAILURE_BLUE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SnackbarDisplayType.BLUE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[SnackbarDisplayType.DROP.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[SnackbarDisplayType.NORMAL.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[SnackbarDisplayType.SUCCESS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[SnackbarDisplayType.SUBSCRIBER_BENEFIT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        private final HabiticaSnackbar make(ViewGroup viewGroup, int i10) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.snackbar_view, viewGroup, false);
            q.f(inflate);
            HabiticaSnackbar habiticaSnackbar = new HabiticaSnackbar(viewGroup, inflate, new ContentViewCallback(inflate), null);
            habiticaSnackbar.setDuration(i10);
            return habiticaSnackbar;
        }

        private final void showConfettiAnimation(final ViewGroup viewGroup) {
            viewGroup.postDelayed(new Runnable() { // from class: com.habitrpg.android.habitica.ui.views.i
                @Override // java.lang.Runnable
                public final void run() {
                    HabiticaSnackbar.Companion.showConfettiAnimation$lambda$3(viewGroup);
                }
            }, 500L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showConfettiAnimation$lambda$3(ViewGroup viewGroup) {
            q.i(viewGroup, "$container");
            new ma.d(viewGroup, 30, androidx.core.content.a.e(viewGroup.getContext(), R.drawable.confetti_blue), 6000L).p(7.0E-4f, 90).v(134.0f, 164.0f).w(0.8f, 1.2f).x(-0.15f, 0.15f, -0.15f, -0.45f).r(200L, new AccelerateInterpolator()).l(viewGroup, 80, 7, 1000);
            new ma.d(viewGroup, 30, androidx.core.content.a.e(viewGroup.getContext(), R.drawable.confetti_red), 6000L).p(6.0E-4f, 90).v(134.0f, 164.0f).w(0.8f, 1.2f).x(-0.15f, 0.15f, -0.15f, -0.45f).r(200L, new AccelerateInterpolator()).l(viewGroup, 80, 7, 1000);
            new ma.d(viewGroup, 30, androidx.core.content.a.e(viewGroup.getContext(), R.drawable.confetti_yellow), 6000L).p(7.0E-4f, 90).v(134.0f, 164.0f).w(0.8f, 1.2f).x(-0.15f, 0.15f, -0.15f, -0.45f).r(200L, new AccelerateInterpolator()).l(viewGroup, 80, 7, 1000);
            new ma.d(viewGroup, 30, androidx.core.content.a.e(viewGroup.getContext(), R.drawable.confetti_purple), 6000L).p(9.0E-4f, 90).v(134.0f, 164.0f).w(0.8f, 1.2f).x(-0.15f, 0.15f, -0.15f, -0.45f).r(200L, new AccelerateInterpolator()).l(viewGroup, 80, 7, 1000);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showSnackbar$lambda$1(HabiticaSnackbar habiticaSnackbar) {
            q.i(habiticaSnackbar, "$snackbar");
            habiticaSnackbar.getView().startAnimation(Animations.negativeShakeAnimation$default(Animations.INSTANCE, 0.0f, 1, null));
        }

        private final void showSubscriberBenefitAnimation(final ViewGroup viewGroup, final HabiticaSnackbar habiticaSnackbar) {
            viewGroup.postDelayed(new Runnable() { // from class: com.habitrpg.android.habitica.ui.views.h
                @Override // java.lang.Runnable
                public final void run() {
                    HabiticaSnackbar.Companion.showSubscriberBenefitAnimation$lambda$2(viewGroup, habiticaSnackbar);
                }
            }, 500L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showSubscriberBenefitAnimation$lambda$2(ViewGroup viewGroup, HabiticaSnackbar habiticaSnackbar) {
            q.i(viewGroup, "$container");
            q.i(habiticaSnackbar, "$snackbar");
            new ma.d(viewGroup, 300, androidx.core.content.a.e(viewGroup.getContext(), R.drawable.confetti_subs), 800L).q(200L).z(0.05f, 0.2f).w(0.8f, 1.2f).v(134.0f, 164.0f).k(habiticaSnackbar.getView(), m.e.DEFAULT_DRAG_ANIMATION_DURATION, 600);
        }

        public final void showSnackbar(ViewGroup viewGroup, CharSequence charSequence, SnackbarDisplayType snackbarDisplayType, boolean z10, boolean z11, int i10) {
            q.i(viewGroup, "container");
            q.i(snackbarDisplayType, "displayType");
            showSnackbar(viewGroup, null, null, charSequence, null, null, 0, null, snackbarDisplayType, z10, z11, i10);
        }

        public final void showSnackbar(ViewGroup viewGroup, Drawable drawable, CharSequence charSequence, CharSequence charSequence2, SnackbarDisplayType snackbarDisplayType, boolean z10, boolean z11, int i10) {
            q.i(viewGroup, "container");
            q.i(drawable, "leftImage");
            q.i(snackbarDisplayType, "displayType");
            showSnackbar(viewGroup, drawable, charSequence, charSequence2, null, null, 0, null, snackbarDisplayType, z10, z11, i10);
        }

        public final void showSnackbar(ViewGroup viewGroup, CharSequence charSequence, CharSequence charSequence2, Drawable drawable, Integer num, String str, SnackbarDisplayType snackbarDisplayType, boolean z10, boolean z11, int i10) {
            q.i(viewGroup, "container");
            q.i(drawable, "rightIcon");
            q.i(str, "rightText");
            q.i(snackbarDisplayType, "displayType");
            showSnackbar(viewGroup, null, charSequence, charSequence2, null, drawable, num, str, snackbarDisplayType, z10, z11, i10);
        }

        public final void showSnackbar(ViewGroup viewGroup, CharSequence charSequence, CharSequence charSequence2, View view, SnackbarDisplayType snackbarDisplayType, boolean z10, boolean z11, int i10) {
            q.i(viewGroup, "container");
            q.i(snackbarDisplayType, "displayType");
            showSnackbar(viewGroup, null, charSequence, charSequence2, view, null, 0, null, snackbarDisplayType, z10, z11, i10);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void showSnackbar(android.view.ViewGroup r2, android.graphics.drawable.Drawable r3, java.lang.CharSequence r4, java.lang.CharSequence r5, android.view.View r6, android.graphics.drawable.Drawable r7, java.lang.Integer r8, java.lang.String r9, com.habitrpg.android.habitica.ui.views.HabiticaSnackbar.SnackbarDisplayType r10, boolean r11, boolean r12, int r13) {
            /*
                r1 = this;
                java.lang.String r0 = "container"
                qc.q.i(r2, r0)
                java.lang.String r0 = "displayType"
                qc.q.i(r10, r0)
                com.habitrpg.android.habitica.ui.views.HabiticaSnackbar r13 = r1.make(r2, r13)
                com.habitrpg.android.habitica.ui.views.HabiticaSnackbar r6 = com.habitrpg.android.habitica.ui.views.HabiticaSnackbar.access$setSpecialView(r13, r6)
                com.habitrpg.android.habitica.ui.views.HabiticaSnackbar r3 = r6.setLeftIcon(r3)
                r6 = 0
                r13 = 1
                if (r4 == 0) goto L23
                boolean r0 = yc.m.u(r4)
                r0 = r0 ^ r13
                if (r0 != r13) goto L23
                r0 = 1
                goto L24
            L23:
                r0 = 0
            L24:
                if (r0 == 0) goto L29
                r3.setTitle(r4)
            L29:
                if (r5 == 0) goto L34
                boolean r0 = yc.m.u(r5)
                r0 = r0 ^ r13
                if (r0 != r13) goto L34
                r0 = 1
                goto L35
            L34:
                r0 = 0
            L35:
                if (r0 == 0) goto L4a
                if (r4 == 0) goto L41
                boolean r4 = yc.m.u(r4)
                r4 = r4 ^ r13
                if (r4 != r13) goto L41
                r6 = 1
            L41:
                if (r6 != 0) goto L47
                r3.setTitle(r5)
                goto L4a
            L47:
                r3.setText(r5)
            L4a:
                if (r8 == 0) goto L56
                r8.intValue()
                int r4 = r8.intValue()
                r3.setRightDiff(r7, r4, r9)
            L56:
                int[] r4 = com.habitrpg.android.habitica.ui.views.HabiticaSnackbar.Companion.WhenMappings.$EnumSwitchMapping$0
                int r5 = r10.ordinal()
                r4 = r4[r5]
                switch(r4) {
                    case 1: goto L9e;
                    case 2: goto L97;
                    case 3: goto L90;
                    case 4: goto L90;
                    case 5: goto L89;
                    case 6: goto L89;
                    case 7: goto L82;
                    case 8: goto L62;
                    default: goto L61;
                }
            L61:
                goto La4
            L62:
                r4 = 2131231432(0x7f0802c8, float:1.8078945E38)
                r3.setBackgroundResource(r4)
                android.content.Context r4 = r2.getContext()
                r5 = 2131099877(0x7f0600e5, float:1.781212E38)
                int r4 = androidx.core.content.a.c(r4, r5)
                r3.setTitleColor(r4)
                android.content.Context r4 = r2.getContext()
                int r4 = androidx.core.content.a.c(r4, r5)
                r3.setTextColor(r4)
                goto La4
            L82:
                r4 = 2131231386(0x7f08029a, float:1.8078852E38)
                r3.setBackgroundResource(r4)
                goto La4
            L89:
                r4 = 2131231385(0x7f080299, float:1.807885E38)
                r3.setBackgroundResource(r4)
                goto La4
            L90:
                r4 = 2131231384(0x7f080298, float:1.8078847E38)
                r3.setBackgroundResource(r4)
                goto La4
            L97:
                r4 = 2131231383(0x7f080297, float:1.8078845E38)
                r3.setBackgroundResource(r4)
                goto La4
            L9e:
                r4 = 2131231387(0x7f08029b, float:1.8078854E38)
                r3.setBackgroundResource(r4)
            La4:
                if (r11 == 0) goto Laa
                r1.showConfettiAnimation(r2)
                goto Laf
            Laa:
                if (r12 == 0) goto Laf
                r1.showSubscriberBenefitAnimation(r2, r3)
            Laf:
                r3.show()
                com.habitrpg.android.habitica.ui.views.HabiticaSnackbar$SnackbarDisplayType r4 = com.habitrpg.android.habitica.ui.views.HabiticaSnackbar.SnackbarDisplayType.FAILURE
                if (r10 == r4) goto Lba
                com.habitrpg.android.habitica.ui.views.HabiticaSnackbar$SnackbarDisplayType r4 = com.habitrpg.android.habitica.ui.views.HabiticaSnackbar.SnackbarDisplayType.FAILURE_BLUE
                if (r10 != r4) goto Lc4
            Lba:
                com.habitrpg.android.habitica.ui.views.j r4 = new com.habitrpg.android.habitica.ui.views.j
                r4.<init>()
                r5 = 600(0x258, double:2.964E-321)
                r2.postDelayed(r4, r5)
            Lc4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.HabiticaSnackbar.Companion.showSnackbar(android.view.ViewGroup, android.graphics.drawable.Drawable, java.lang.CharSequence, java.lang.CharSequence, android.view.View, android.graphics.drawable.Drawable, java.lang.Integer, java.lang.String, com.habitrpg.android.habitica.ui.views.HabiticaSnackbar$SnackbarDisplayType, boolean, boolean, int):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HabiticaSnackbar.kt */
    /* loaded from: classes4.dex */
    public static final class ContentViewCallback implements com.google.android.material.snackbar.b {
        private final View content;

        public ContentViewCallback(View view) {
            q.i(view, "content");
            this.content = view;
        }

        @Override // com.google.android.material.snackbar.b
        public void animateContentIn(int i10, int i11) {
            this.content.setScaleY(0.0f);
            this.content.setScaleX(0.0f);
            long j10 = i11;
            long j11 = i10;
            p0.e(this.content).g(1.0f).h(j10).l(j11);
            p0.e(this.content).f(1.0f).h(j10).l(j11);
            p0.e(this.content).b(1.0f).h(j10).l(j11);
        }

        @Override // com.google.android.material.snackbar.b
        public void animateContentOut(int i10, int i11) {
            this.content.setScaleY(1.0f);
            this.content.setScaleX(1.0f);
            long j10 = i11;
            long j11 = i10;
            p0.e(this.content).g(0.0f).h(j10).l(j11);
            p0.e(this.content).f(0.0f).h(j10).l(j11);
            p0.e(this.content).b(0.0f).h(j10).l(j11);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HabiticaSnackbar.kt */
    /* loaded from: classes4.dex */
    public static final class SnackbarDisplayType {
        private static final /* synthetic */ jc.a $ENTRIES;
        private static final /* synthetic */ SnackbarDisplayType[] $VALUES;
        public static final SnackbarDisplayType NORMAL = new SnackbarDisplayType("NORMAL", 0);
        public static final SnackbarDisplayType FAILURE = new SnackbarDisplayType("FAILURE", 1);
        public static final SnackbarDisplayType FAILURE_BLUE = new SnackbarDisplayType("FAILURE_BLUE", 2);
        public static final SnackbarDisplayType DROP = new SnackbarDisplayType("DROP", 3);
        public static final SnackbarDisplayType SUCCESS = new SnackbarDisplayType("SUCCESS", 4);
        public static final SnackbarDisplayType BLUE = new SnackbarDisplayType("BLUE", 5);
        public static final SnackbarDisplayType BLACK = new SnackbarDisplayType("BLACK", 6);
        public static final SnackbarDisplayType SUBSCRIBER_BENEFIT = new SnackbarDisplayType("SUBSCRIBER_BENEFIT", 7);

        private static final /* synthetic */ SnackbarDisplayType[] $values() {
            return new SnackbarDisplayType[]{NORMAL, FAILURE, FAILURE_BLUE, DROP, SUCCESS, BLUE, BLACK, SUBSCRIBER_BENEFIT};
        }

        static {
            SnackbarDisplayType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = jc.b.a($values);
        }

        private SnackbarDisplayType(String str, int i10) {
        }

        public static jc.a<SnackbarDisplayType> getEntries() {
            return $ENTRIES;
        }

        public static SnackbarDisplayType valueOf(String str) {
            return (SnackbarDisplayType) Enum.valueOf(SnackbarDisplayType.class, str);
        }

        public static SnackbarDisplayType[] values() {
            return (SnackbarDisplayType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ HabiticaSnackbar(ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback, qc.h hVar) {
        this(viewGroup, view, contentViewCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HabiticaSnackbar setSpecialView(View view) {
        if (view != null) {
            this.binding.contentContainer.addView(view);
        }
        return this;
    }

    public final SnackbarViewBinding getBinding() {
        return this.binding;
    }

    public final HabiticaSnackbar setBackgroundColor(int i10) {
        this.view.setBackgroundColor(i10);
        return this;
    }

    public final HabiticaSnackbar setBackgroundResource(int i10) {
        this.binding.snackbarView.setBackgroundResource(i10);
        this.view.setBackgroundColor(androidx.core.content.a.c(getContext(), R.color.transparent));
        return this;
    }

    public final HabiticaSnackbar setLeftIcon(Drawable drawable) {
        int i10;
        this.binding.leftImageView.setImageDrawable(drawable);
        ImageView imageView = this.binding.leftImageView;
        if (drawable != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        return this;
    }

    public final HabiticaSnackbar setRightDiff(Drawable drawable, int i10, String str) {
        if (drawable == null) {
            return this;
        }
        this.binding.rightView.setVisibility(0);
        this.binding.rightIconView.setImageDrawable(drawable);
        this.binding.rightTextView.setTextColor(i10);
        this.binding.rightTextView.setText(str);
        return this;
    }

    public final HabiticaSnackbar setText(CharSequence charSequence) {
        int i10;
        this.binding.snackbarText.setText(charSequence);
        TextView textView = this.binding.snackbarText;
        if (charSequence != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        return this;
    }

    public final HabiticaSnackbar setTextColor(int i10) {
        this.binding.snackbarText.setTextColor(i10);
        return this;
    }

    public final HabiticaSnackbar setTitle(CharSequence charSequence) {
        int i10;
        this.binding.snackbarTitle.setText(charSequence);
        TextView textView = this.binding.snackbarTitle;
        if (charSequence != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        return this;
    }

    public final HabiticaSnackbar setTitleColor(int i10) {
        this.binding.snackbarTitle.setTextColor(i10);
        return this;
    }

    private HabiticaSnackbar(ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback) {
        super(viewGroup, view, contentViewCallback);
        SnackbarViewBinding bind = SnackbarViewBinding.bind(view);
        q.h(bind, "bind(...)");
        this.binding = bind;
    }
}
