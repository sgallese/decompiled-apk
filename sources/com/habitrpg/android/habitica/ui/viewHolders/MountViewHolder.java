package com.habitrpg.android.habitica.ui.viewHolders;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.MountOverviewItemBinding;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.models.inventory.Mount;
import com.habitrpg.android.habitica.ui.views.BottomSheetUtilsKt;
import com.habitrpg.common.habitica.extensions.DataBindingUtils;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dc.w;
import qc.q;
import yc.v;

/* compiled from: MountViewHolder.kt */
/* loaded from: classes4.dex */
public final class MountViewHolder extends RecyclerView.f0 implements View.OnClickListener {
    public static final int $stable = 8;
    private Mount animal;
    private MountOverviewItemBinding binding;
    private String currentMount;
    private final pc.l<String, w> onEquip;
    private boolean owned;
    private Resources resources;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MountViewHolder(ViewGroup viewGroup, pc.l<? super String, w> lVar) {
        super(ViewGroupExt.inflate$default(viewGroup, R.layout.mount_overview_item, false, 2, null));
        q.i(viewGroup, "parent");
        this.onEquip = lVar;
        MountOverviewItemBinding bind = MountOverviewItemBinding.bind(this.itemView);
        q.h(bind, "bind(...)");
        this.binding = bind;
        Resources resources = this.itemView.getResources();
        q.h(resources, "getResources(...)");
        this.resources = resources;
        this.itemView.setOnClickListener(this);
    }

    public final void bind(Mount mount, boolean z10, String str) {
        String str2;
        boolean s10;
        q.i(mount, "item");
        this.animal = mount;
        this.owned = z10;
        this.currentMount = str;
        int i10 = 8;
        this.binding.titleTextView.setVisibility(8);
        this.binding.ownedTextView.setVisibility(8);
        String str3 = "stable_Mount_Icon_" + mount.getAnimal() + "-" + mount.getColor();
        this.binding.imageView.setAlpha(1.0f);
        if (!z10) {
            this.binding.imageView.setAlpha(0.2f);
        }
        this.binding.imageView.setBackground(null);
        ImageView imageView = this.binding.activeIndicator;
        Mount mount2 = this.animal;
        if (mount2 != null) {
            str2 = mount2.getKey();
        } else {
            str2 = null;
        }
        s10 = v.s(str, str2, false, 2, null);
        if (s10) {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        this.binding.imageView.setTag(str3);
        DataBindingUtils dataBindingUtils = DataBindingUtils.INSTANCE;
        Context context = this.itemView.getContext();
        q.h(context, "getContext(...)");
        dataBindingUtils.loadImage(context, str3, new MountViewHolder$bind$1(z10, this, str3));
    }

    public final Mount getAnimal() {
        return this.animal;
    }

    public final Resources getResources() {
        return this.resources;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        q.i(view, "v");
        if (!this.owned) {
            return;
        }
        Context context = this.itemView.getContext();
        Mount mount = this.animal;
        if (mount != null) {
            if (context instanceof ViewComponentManager$FragmentContextWrapper) {
                context = ((ViewComponentManager$FragmentContextWrapper) context).getBaseContext();
            }
            q.g(context, "null cannot be cast to non-null type android.app.Activity");
            BottomSheetUtilsKt.showAsBottomSheet((Activity) context, q0.c.c(278277382, true, new MountViewHolder$onClick$1$1(mount, this)));
        }
    }

    public final void setAnimal(Mount mount) {
        this.animal = mount;
    }

    public final void setResources(Resources resources) {
        q.i(resources, "<set-?>");
        this.resources = resources;
    }
}
