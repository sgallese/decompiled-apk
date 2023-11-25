package com.habitrpg.android.habitica.data.local;

import com.habitrpg.android.habitica.models.inventory.Customization;
import dd.g;
import java.util.List;

/* compiled from: CustomizationLocalRepository.kt */
/* loaded from: classes4.dex */
public interface CustomizationLocalRepository extends ContentLocalRepository {
    g<List<Customization>> getCustomizations(String str, String str2, boolean z10);
}
