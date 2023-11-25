package com.habitrpg.android.habitica.ui.views.tasks.form;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.TaskFormChecklistItemBinding;
import com.habitrpg.android.habitica.extensions.OnChangeTextWatcher;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import dc.w;
import qc.q;
import qc.r;

/* compiled from: ChecklistItemFormView.kt */
/* loaded from: classes4.dex */
public final class ChecklistItemFormView extends LinearLayout {
    public static final int $stable = 8;
    private long animDuration;
    private final TaskFormChecklistItemBinding binding;
    private boolean isAddButton;
    private ChecklistItem item;
    private pc.l<? super String, w> textChangedListener;
    private int tintColor;

    /* compiled from: ChecklistItemFormView.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.views.tasks.form.ChecklistItemFormView$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass2 extends r implements pc.r<CharSequence, Integer, Integer, Integer, w> {
        AnonymousClass2() {
            super(4);
        }

        @Override // pc.r
        public /* bridge */ /* synthetic */ w invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return w.f13270a;
        }

        public final void invoke(CharSequence charSequence, int i10, int i11, int i12) {
            ChecklistItemFormView.this.getItem().setText(String.valueOf(charSequence));
            ChecklistItemFormView.this.setContentDescription(charSequence);
            pc.l<String, w> textChangedListener = ChecklistItemFormView.this.getTextChangedListener();
            if (textChangedListener != null) {
                textChangedListener.invoke(String.valueOf(charSequence));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChecklistItemFormView(Context context) {
        this(context, null, 0, 6, null);
        q.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ChecklistItemFormView checklistItemFormView, View view) {
        ViewGroup viewGroup;
        q.i(checklistItemFormView, "this$0");
        if (!checklistItemFormView.isAddButton) {
            ViewParent parent = checklistItemFormView.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(checklistItemFormView);
            }
        }
    }

    public final long getAnimDuration() {
        return this.animDuration;
    }

    public final TaskFormChecklistItemBinding getBinding() {
        return this.binding;
    }

    public final View getDragGrip() {
        ImageView imageView = this.binding.dragGrip;
        q.h(imageView, "dragGrip");
        return imageView;
    }

    public final ChecklistItem getItem() {
        return this.item;
    }

    public final pc.l<String, w> getTextChangedListener() {
        return this.textChangedListener;
    }

    public final int getTintColor() {
        return this.tintColor;
    }

    public final boolean isAddButton() {
        return this.isAddButton;
    }

    public final void setAddButton(final boolean z10) {
        int i10;
        int i11;
        RotateAnimation rotateAnimation;
        ImageButton imageButton = this.binding.button;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        imageButton.setImportantForAccessibility(i10);
        if (this.isAddButton == z10) {
            return;
        }
        this.isAddButton = z10;
        AppCompatEditText appCompatEditText = this.binding.editText;
        Context context = getContext();
        if (z10) {
            i11 = R.string.new_checklist_item;
        } else {
            i11 = R.string.checklist_text;
        }
        appCompatEditText.setHint(context.getString(i11));
        if (z10) {
            setContentDescription(getContext().getString(R.string.new_checklist_item));
            this.binding.dragGrip.setVisibility(8);
            rotateAnimation = new RotateAnimation(135.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        } else {
            this.binding.dragGrip.setVisibility(0);
            rotateAnimation = new RotateAnimation(0.0f, 135.0f, 1, 0.5f, 1, 0.5f);
        }
        rotateAnimation.setDuration(this.animDuration);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.form.ChecklistItemFormView$isAddButton$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                float f10;
                ImageButton imageButton2 = ChecklistItemFormView.this.getBinding().button;
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 135.0f;
                }
                imageButton2.setRotation(f10);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        this.binding.button.startAnimation(rotateAnimation);
    }

    public final void setAnimDuration(long j10) {
        this.animDuration = j10;
    }

    public final void setItem(ChecklistItem checklistItem) {
        q.i(checklistItem, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.item = checklistItem;
        this.binding.editText.setText(checklistItem.getText());
    }

    public final void setTextChangedListener(pc.l<? super String, w> lVar) {
        this.textChangedListener = lVar;
    }

    public final void setTintColor(int i10) {
        this.tintColor = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChecklistItemFormView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.i(context, "context");
    }

    public /* synthetic */ ChecklistItemFormView(Context context, AttributeSet attributeSet, int i10, int i11, qc.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChecklistItemFormView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.i(context, "context");
        TaskFormChecklistItemBinding inflate = TaskFormChecklistItemBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        this.item = new ChecklistItem(null, null, false, 7, null);
        this.tintColor = ContextExtensionsKt.getThemeColor(context, R.attr.tintedUiSub);
        this.isAddButton = true;
        setMinimumHeight(IntExtensionsKt.dpToPx(38, context));
        setBackground(androidx.core.content.a.e(context, R.drawable.layout_rounded_bg_task_form));
        getBackground().mutate().setTint(ContextExtensionsKt.getThemeColor(context, R.attr.colorTintedBackgroundOffset));
        setGravity(16);
        inflate.button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.form.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChecklistItemFormView._init_$lambda$0(ChecklistItemFormView.this, view);
            }
        });
        inflate.button.setContentDescription(context.getString(R.string.delete_checklist_entry));
        inflate.button.getDrawable().mutate().setTint(this.tintColor);
        inflate.editText.addTextChangedListener(new OnChangeTextWatcher(new AnonymousClass2()));
        inflate.editText.setLabelFor(inflate.button.getId());
    }
}
