package com.habitrpg.android.habitica.interactors;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.a;
import androidx.core.util.d;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.interactors.UseCase;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.BaseActivity;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import ec.h0;
import ec.u;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import qc.h;
import qc.q;
import vc.f;
import vc.l;

/* compiled from: NotifyUserUseCase.kt */
/* loaded from: classes4.dex */
public final class NotifyUserUseCase extends UseCase<RequestValues, Stats> {
    private static final NumberFormat formatter;
    private final LevelUpUseCase levelUpUseCase;
    private final UserRepository userRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NotifyUserUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        private final View createTextView(Context context, double d10, Bitmap bitmap) {
            String str;
            TextView textView = new TextView(context);
            textView.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(context.getResources(), bitmap), (Drawable) null, (Drawable) null, (Drawable) null);
            if (d10 > 0.0d) {
                str = " + " + getFormatter().format(Math.abs(d10));
            } else {
                str = " - " + getFormatter().format(Math.abs(d10));
            }
            textView.setText(str);
            textView.setGravity(16);
            textView.setTextColor(a.c(context, R.color.white));
            return textView;
        }

        private final String formatValue(double d10) {
            if (d10 >= 0.0d) {
                return " + " + getFormatter().format(Math.abs(d10));
            }
            return " - " + getFormatter().format(Math.abs(d10));
        }

        public final NumberFormat getFormatter() {
            return NotifyUserUseCase.formatter;
        }

        public final d<View, HabiticaSnackbar.SnackbarDisplayType> getNotificationAndAddStatsToUser(Context context, Double d10, Double d11, Double d12, Double d13, Double d14, User user) {
            f s10;
            int s11;
            boolean z10;
            q.i(context, "context");
            HabiticaSnackbar.SnackbarDisplayType snackbarDisplayType = HabiticaSnackbar.SnackbarDisplayType.SUCCESS;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            if (d10 != null && d10.doubleValue() > 0.0d) {
                double doubleValue = d10.doubleValue();
                Bitmap imageOfExperience = HabiticaIconsHelper.imageOfExperience();
                q.h(imageOfExperience, "imageOfExperience(...)");
                linearLayout.addView(createTextView(context, doubleValue, imageOfExperience));
            }
            if (d11 != null && !q.b(d11, 0.0d)) {
                if (d11.doubleValue() < 0.0d) {
                    snackbarDisplayType = HabiticaSnackbar.SnackbarDisplayType.FAILURE;
                }
                double doubleValue2 = d11.doubleValue();
                Bitmap imageOfHeartDarkBg = HabiticaIconsHelper.imageOfHeartDarkBg();
                q.h(imageOfHeartDarkBg, "imageOfHeartDarkBg(...)");
                linearLayout.addView(createTextView(context, doubleValue2, imageOfHeartDarkBg));
            }
            if (d12 != null && !q.b(d12, 0.0d)) {
                double doubleValue3 = d12.doubleValue();
                Bitmap imageOfGold = HabiticaIconsHelper.imageOfGold();
                q.h(imageOfGold, "imageOfGold(...)");
                linearLayout.addView(createTextView(context, doubleValue3, imageOfGold));
                if (d12.doubleValue() < 0.0d) {
                    snackbarDisplayType = HabiticaSnackbar.SnackbarDisplayType.FAILURE;
                }
            }
            if (d13 != null && d13.doubleValue() > 0.0d) {
                if (user != null && user.getHasClass()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    double doubleValue4 = d13.doubleValue();
                    Bitmap imageOfMagic = HabiticaIconsHelper.imageOfMagic();
                    q.h(imageOfMagic, "imageOfMagic(...)");
                    linearLayout.addView(createTextView(context, doubleValue4, imageOfMagic));
                }
            }
            if (d14 != null && d14.doubleValue() > 0.0d) {
                double doubleValue5 = d14.doubleValue();
                Bitmap imageOfDamage = HabiticaIconsHelper.imageOfDamage();
                q.h(imageOfDamage, "imageOfDamage(...)");
                linearLayout.addView(createTextView(context, doubleValue5, imageOfDamage));
            }
            int childCount = linearLayout.getChildCount();
            if (childCount == 0) {
                return new d<>(null, snackbarDisplayType);
            }
            int dimension = (int) context.getResources().getDimension(R.dimen.spacing_medium);
            s10 = l.s(1, childCount);
            s11 = u.s(s10, 10);
            ArrayList arrayList = new ArrayList(s11);
            Iterator<Integer> it = s10.iterator();
            while (it.hasNext()) {
                arrayList.add(linearLayout.getChildAt(((h0) it).a()));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setPadding(dimension, 0, 0, 0);
            }
            return new d<>(linearLayout, snackbarDisplayType);
        }

        public final d<SpannableStringBuilder, HabiticaSnackbar.SnackbarDisplayType> getNotificationAndAddStatsToUserAsText(Double d10, Double d11, Double d12, Double d13) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            HabiticaSnackbar.SnackbarDisplayType snackbarDisplayType = HabiticaSnackbar.SnackbarDisplayType.NORMAL;
            if (d10 != null && !q.b(d10, 0.0d)) {
                spannableStringBuilder.append((CharSequence) formatValue(d10.doubleValue())).append((CharSequence) " Exp");
            }
            if (d11 != null && !q.b(d11, 0.0d)) {
                if (d11.doubleValue() < 0.0d) {
                    snackbarDisplayType = HabiticaSnackbar.SnackbarDisplayType.FAILURE;
                }
                spannableStringBuilder.append((CharSequence) formatValue(d11.doubleValue())).append((CharSequence) " Health");
            }
            if (d12 != null && !q.b(d12, 0.0d)) {
                if (d12.doubleValue() < 0.0d) {
                    snackbarDisplayType = HabiticaSnackbar.SnackbarDisplayType.FAILURE;
                }
                spannableStringBuilder.append((CharSequence) formatValue(d12.doubleValue())).append((CharSequence) " Gold");
            }
            if (d13 != null && !q.b(d13, 0.0d)) {
                spannableStringBuilder.append((CharSequence) formatValue(d13.doubleValue())).append((CharSequence) " Exp").append((CharSequence) " Mana");
            }
            return new d<>(spannableStringBuilder, snackbarDisplayType);
        }
    }

    /* compiled from: NotifyUserUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class RequestValues implements UseCase.RequestValues {
        public static final int $stable = 8;
        private final BaseActivity context;
        private final Double gold;
        private final Boolean hasLeveledUp;
        private final Double hp;
        private final Integer level;
        private final Double mp;
        private final Double questDamage;
        private final ViewGroup snackbarTargetView;
        private final User user;
        private final Double xp;

        public RequestValues(BaseActivity baseActivity, ViewGroup viewGroup, User user, Double d10, Double d11, Double d12, Double d13, Double d14, Boolean bool, Integer num) {
            q.i(baseActivity, "context");
            q.i(viewGroup, "snackbarTargetView");
            this.context = baseActivity;
            this.snackbarTargetView = viewGroup;
            this.user = user;
            this.xp = d10;
            this.hp = d11;
            this.gold = d12;
            this.mp = d13;
            this.questDamage = d14;
            this.hasLeveledUp = bool;
            this.level = num;
        }

        public final BaseActivity getContext() {
            return this.context;
        }

        public final Double getGold() {
            return this.gold;
        }

        public final Boolean getHasLeveledUp() {
            return this.hasLeveledUp;
        }

        public final Double getHp() {
            return this.hp;
        }

        public final Integer getLevel() {
            return this.level;
        }

        public final Double getMp() {
            return this.mp;
        }

        public final Double getQuestDamage() {
            return this.questDamage;
        }

        public final ViewGroup getSnackbarTargetView() {
            return this.snackbarTargetView;
        }

        public final User getUser() {
            return this.user;
        }

        public final Double getXp() {
            return this.xp;
        }
    }

    static {
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMinimumFractionDigits(0);
        numberFormat.setMaximumFractionDigits(2);
        formatter = numberFormat;
    }

    public NotifyUserUseCase(LevelUpUseCase levelUpUseCase, UserRepository userRepository) {
        q.i(levelUpUseCase, "levelUpUseCase");
        q.i(userRepository, "userRepository");
        this.levelUpUseCase = levelUpUseCase;
        this.userRepository = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9 A[RETURN] */
    @Override // com.habitrpg.android.habitica.interactors.UseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object run(com.habitrpg.android.habitica.interactors.NotifyUserUseCase.RequestValues r20, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.Stats> r21) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.interactors.NotifyUserUseCase.run(com.habitrpg.android.habitica.interactors.NotifyUserUseCase$RequestValues, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
