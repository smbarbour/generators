/*
 * Copyright (c) bdew, 2014
 * https://github.com/bdew/generators
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://bdew.net/minecraft-mod-public-license/
 */

package net.bdew.generators.config.loader

import net.bdew.lib.recipes.{RecipeStatement, StackRef}

abstract class ResKindRef

case class ResKindFluid(name: String) extends ResKindRef

case class ResKindItem(spec: StackRef) extends ResKindRef

case class ResourceRef(res: ResKindRef, amount: Double)

case class RsTurbineFuel(fluid: String, value: Float) extends RecipeStatement

case class RsTurbineBlacklist(fluid: String) extends RecipeStatement

case class RsExchangerHeat(input: ResourceRef, output: ResourceRef, heat: Double) extends RecipeStatement

case class RsExchangerCool(input: ResourceRef, output: ResourceRef, heat: Double) extends RecipeStatement

case class RsExchangerBlacklist(res: ResKindRef) extends RecipeStatement

