package com.habitrpg.android.habitica.ui.adapter;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.SkillListItemBinding;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.models.Skill;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import dc.w;
import ec.t;
import io.realm.x0;
import java.util.Iterator;
import java.util.List;
import pc.l;
import qc.q;

/* compiled from: SkillsRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public final class SkillsRecyclerViewAdapter extends RecyclerView.h<SkillViewHolder> {
    public static final int $stable = 8;
    private int level;
    private double mana;
    private l<? super Skill, w> onUseSkill;
    private List<? extends Skill> skillList;
    private x0<OwnedItem> specialItems;

    /* compiled from: SkillsRecyclerViewAdapter.kt */
    /* loaded from: classes4.dex */
    public final class SkillViewHolder extends RecyclerView.f0 implements View.OnClickListener {
        private final SkillListItemBinding binding;
        private Context context;
        private final Drawable lockDrawable;
        private final Drawable magicDrawable;
        private Skill skill;
        final /* synthetic */ SkillsRecyclerViewAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SkillViewHolder(SkillsRecyclerViewAdapter skillsRecyclerViewAdapter, View view) {
            super(view);
            q.i(view, "itemView");
            this.this$0 = skillsRecyclerViewAdapter;
            SkillListItemBinding bind = SkillListItemBinding.bind(view);
            q.h(bind, "bind(...)");
            this.binding = bind;
            Context context = view.getContext();
            q.h(context, "getContext(...)");
            this.context = context;
            bind.buttonWrapper.setOnClickListener(this);
            this.magicDrawable = new BitmapDrawable(this.context.getResources(), HabiticaIconsHelper.imageOfMagic());
            this.lockDrawable = new BitmapDrawable(this.context.getResources(), HabiticaIconsHelper.imageOfLocked(androidx.core.content.a.c(this.context, R.color.text_dimmed)));
        }

        private final int getOwnedCount(String str) {
            OwnedItem ownedItem;
            x0<OwnedItem> specialItems = this.this$0.getSpecialItems();
            if (specialItems != null) {
                Iterator<OwnedItem> it = specialItems.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ownedItem = it.next();
                        if (q.d(ownedItem.getKey(), str)) {
                            break;
                        }
                    } else {
                        ownedItem = null;
                        break;
                    }
                }
                OwnedItem ownedItem2 = ownedItem;
                if (ownedItem2 != null) {
                    return ownedItem2.getNumberOwned();
                }
            }
            return 0;
        }

        public final void bind(Skill skill) {
            String str;
            int i10;
            int i11;
            q.i(skill, "skill");
            this.skill = skill;
            this.binding.skillText.setText(skill.getText());
            this.binding.skillNotes.setText(skill.getNotes());
            this.binding.skillText.setTextColor(androidx.core.content.a.c(this.context, R.color.text_primary));
            this.binding.skillNotes.setTextColor(androidx.core.content.a.c(this.context, R.color.text_ternary));
            this.binding.skillNotes.setVisibility(0);
            this.binding.priceLabel.setVisibility(0);
            if (q.d("special", skill.getHabitClass())) {
                this.binding.countLabel.setVisibility(0);
                this.binding.countLabel.setText(String.valueOf(getOwnedCount(skill.getKey())));
                this.binding.priceLabel.setText(R.string.skill_transformation_use);
                if (ContextExtensionsKt.isUsingNightModeResources(this.context)) {
                    this.binding.priceLabel.setTextColor(androidx.core.content.a.c(this.context, R.color.brand_500));
                } else {
                    this.binding.priceLabel.setTextColor(androidx.core.content.a.c(this.context, R.color.color_accent));
                }
                this.binding.buttonIconView.setImageDrawable(null);
                this.binding.buttonWrapper.setBackgroundColor(androidx.core.content.a.c(this.context, R.color.offset_background));
                this.binding.buttonIconView.setAlpha(1.0f);
                this.binding.priceLabel.setAlpha(1.0f);
            } else {
                this.binding.countLabel.setVisibility(8);
                TextView textView = this.binding.priceLabel;
                Integer mana = skill.getMana();
                if (mana != null) {
                    str = mana.toString();
                } else {
                    str = null;
                }
                textView.setText(str);
                if (ContextExtensionsKt.isUsingNightModeResources(this.context)) {
                    this.binding.priceLabel.setTextColor(androidx.core.content.a.c(this.context, R.color.blue_500));
                } else {
                    this.binding.priceLabel.setTextColor(androidx.core.content.a.c(this.context, R.color.blue_10));
                }
                this.binding.buttonIconView.setImageDrawable(this.magicDrawable);
                Integer mana2 = skill.getMana();
                if (mana2 != null) {
                    i10 = mana2.intValue();
                } else {
                    i10 = 0;
                }
                if (i10 > this.this$0.getMana()) {
                    this.binding.buttonWrapper.setBackgroundColor(androidx.core.content.a.c(this.context, R.color.offset_background));
                    this.binding.buttonIconView.setAlpha(0.3f);
                    this.binding.priceLabel.setAlpha(0.3f);
                } else {
                    this.binding.buttonWrapper.setBackgroundColor(androidx.core.content.a.c(this.context, R.color.blue_500_24));
                    this.binding.buttonIconView.setAlpha(1.0f);
                    this.binding.priceLabel.setAlpha(1.0f);
                }
                Integer lvl = skill.getLvl();
                if (lvl != null) {
                    i11 = lvl.intValue();
                } else {
                    i11 = 0;
                }
                if (i11 > this.this$0.getLevel()) {
                    this.binding.buttonWrapper.setBackgroundColor(androidx.core.content.a.c(this.context, R.color.offset_background));
                    this.binding.skillText.setTextColor(androidx.core.content.a.c(this.context, R.color.text_dimmed));
                    this.binding.skillText.setText(this.context.getString(R.string.skill_unlocks_at, skill.getLvl()));
                    this.binding.skillNotes.setVisibility(8);
                    this.binding.buttonIconView.setImageDrawable(this.lockDrawable);
                    this.binding.priceLabel.setVisibility(8);
                }
            }
            PixelArtView pixelArtView = this.binding.skillImage;
            q.h(pixelArtView, "skillImage");
            DataBindingUtilsKt.loadImage$default(pixelArtView, "shop_" + skill.getKey(), null, 2, null);
        }

        public final Context getContext() {
            return this.context;
        }

        public final Skill getSkill() {
            return this.skill;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i10;
            Skill skill;
            l<Skill, w> onUseSkill;
            Integer lvl;
            q.i(view, "v");
            Skill skill2 = this.skill;
            if (skill2 != null && (lvl = skill2.getLvl()) != null) {
                i10 = lvl.intValue();
            } else {
                i10 = 0;
            }
            if (i10 <= this.this$0.getLevel() && (skill = this.skill) != null && (onUseSkill = this.this$0.getOnUseSkill()) != null) {
                onUseSkill.invoke(skill);
            }
        }

        public final void setContext(Context context) {
            q.i(context, "<set-?>");
            this.context = context;
        }

        public final void setSkill(Skill skill) {
            this.skill = skill;
        }
    }

    public SkillsRecyclerViewAdapter() {
        List<? extends Skill> i10;
        i10 = t.i();
        this.skillList = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.skillList.size();
    }

    public final int getLevel() {
        return this.level;
    }

    public final double getMana() {
        return this.mana;
    }

    public final l<Skill, w> getOnUseSkill() {
        return this.onUseSkill;
    }

    public final x0<OwnedItem> getSpecialItems() {
        return this.specialItems;
    }

    public final void setLevel(int i10) {
        this.level = i10;
        notifyDataSetChanged();
    }

    public final void setMana(double d10) {
        this.mana = d10;
        notifyDataSetChanged();
    }

    public final void setOnUseSkill(l<? super Skill, w> lVar) {
        this.onUseSkill = lVar;
    }

    public final void setSkillList(List<? extends Skill> list) {
        q.i(list, "skillList");
        this.skillList = list;
        notifyDataSetChanged();
    }

    public final void setSpecialItems(x0<OwnedItem> x0Var) {
        this.specialItems = x0Var;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(SkillViewHolder skillViewHolder, int i10) {
        q.i(skillViewHolder, "holder");
        skillViewHolder.bind(this.skillList.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public SkillViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        return new SkillViewHolder(this, ViewGroupExt.inflate$default(viewGroup, R.layout.skill_list_item, false, 2, null));
    }
}
