/*
 * This class is distributed as part of the Psi Mod.
 * Get the Source Code in github:
 * https://github.com/Vazkii/Psi
 *
 * Psi is Open Source and distributed under the
 * Psi License: https://psi.vazkii.net/license.php
 */
package vazkii.psi.api.spell.piece;

import vazkii.psi.api.spell.EnumPieceType;
import vazkii.psi.api.spell.EnumSpellStat;
import vazkii.psi.api.spell.Spell;
import vazkii.psi.api.spell.SpellContext;
import vazkii.psi.api.spell.SpellMetadata;
import vazkii.psi.api.spell.SpellPiece;
import vazkii.psi.api.spell.SpellRuntimeException;

public abstract class PieceOperator extends SpellPiece {

	public PieceOperator(Spell spell) {
		super(spell);
	}

	@Override
	public EnumPieceType getPieceType() {
		return EnumPieceType.SELECTOR;
	}

	@Override
	public void addToMetadata(SpellMetadata meta) {
		meta.addStat(EnumSpellStat.COMPLEXITY, 1);
	}

	@Override
	public Object evaluate() {
		return null;
	}

	@Override
	public Object execute(SpellContext context) throws SpellRuntimeException {
		return null;
	}

}
