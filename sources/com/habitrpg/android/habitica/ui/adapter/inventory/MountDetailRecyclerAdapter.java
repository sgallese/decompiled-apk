package com.habitrpg.android.habitica.ui.adapter.inventory;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.models.inventory.Mount;
import com.habitrpg.android.habitica.models.inventory.StableSection;
import com.habitrpg.android.habitica.models.user.OwnedMount;
import com.habitrpg.android.habitica.ui.viewHolders.MountViewHolder;
import com.habitrpg.android.habitica.ui.viewHolders.SectionViewHolder;
import dc.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pc.l;
import qc.q;

/* compiled from: MountDetailRecyclerAdapter.kt */
/* loaded from: classes4.dex */
public final class MountDetailRecyclerAdapter extends RecyclerView.h<RecyclerView.f0> {
    public static final int $stable = 8;
    private String currentMount;
    private List<? extends Object> itemList = new ArrayList();
    private l<? super String, w> onEquip;
    private Map<String, ? extends OwnedMount> ownedMounts;

    public final String getCurrentMount() {
        return this.currentMount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.itemList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (this.itemList.size() > i10 && (this.itemList.get(i10) instanceof StableSection)) {
            return 1;
        }
        return 2;
    }

    public final l<String, w> getOnEquip() {
        return this.onEquip;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.f0 f0Var, int i10) {
        q.i(f0Var, "holder");
        Object obj = this.itemList.get(i10);
        MountViewHolder mountViewHolder = null;
        SectionViewHolder sectionViewHolder = null;
        if (obj instanceof StableSection) {
            if (f0Var instanceof SectionViewHolder) {
                sectionViewHolder = (SectionViewHolder) f0Var;
            }
            if (sectionViewHolder != null) {
                sectionViewHolder.bind((StableSection) obj);
            }
        } else if (obj instanceof Mount) {
            if (f0Var instanceof MountViewHolder) {
                mountViewHolder = (MountViewHolder) f0Var;
            }
            if (mountViewHolder != null) {
                Mount mount = (Mount) obj;
                Map<String, ? extends OwnedMount> map = this.ownedMounts;
                boolean z10 = false;
                if (map != null) {
                    String key = mount.getKey();
                    if (key == null) {
                        key = "";
                    }
                    OwnedMount ownedMount = map.get(key);
                    if (ownedMount != null && ownedMount.getOwned()) {
                        z10 = true;
                    }
                }
                mountViewHolder.bind(mount, z10, this.currentMount);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        if (i10 == 1) {
            return new SectionViewHolder(viewGroup);
        }
        return new MountViewHolder(viewGroup, this.onEquip);
    }

    public final void setCurrentMount(String str) {
        this.currentMount = str;
        notifyDataSetChanged();
    }

    public final void setItemList(List<? extends Object> list) {
        q.i(list, "itemList");
        this.itemList = list;
        notifyDataSetChanged();
    }

    public final void setOnEquip(l<? super String, w> lVar) {
        this.onEquip = lVar;
    }

    public final void setOwnedMounts(Map<String, ? extends OwnedMount> map) {
        q.i(map, "ownedMounts");
        this.ownedMounts = map;
        notifyDataSetChanged();
    }
}
