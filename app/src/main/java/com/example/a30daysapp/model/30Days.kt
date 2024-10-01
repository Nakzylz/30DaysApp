package com.example.a30daysapp.model

import com.example.a30daysapp.R

data class Day(
    val day: Int,
    val title: String,
    val description: String,
    val imageRes: Int // Resource ID for the image
)

val days = listOf(
    Day(1, "Get Active", "For 1 hour, walk around your neighborhood or the location of your choice.", R.drawable.walk),
    Day(2, "Dog Walker", "If you have a dog, walk your dog for 1 hour. If you do not have a dog, go for a walk for 2 hours.", R.drawable.dog_walk),
    Day(3, "Shopping", "Walk to the nearest store and go shopping or just walk around the store.", R.drawable.shopping),
    Day(4, "Star Gazing", "Pull a chair outside and gaze at the clouds or stars.", R.drawable.stars),
    Day(5, "Build It", "Go outside and build something in your yard. This can be anything from a house out of sticks or a hammock to a full tree house.", R.drawable.tree_house),
    Day(6, "Sports", "Play some sports either in your yard or at a park with some family/friends. This can also be some solo sports like cycling or hiking.", R.drawable.sports),
    Day(7, "Roasting Smores", "Go camping at the nearest camp site or even set up a tent in the back yard.", R.drawable.smores),
    Day(8, "Yoga?", "Do some yoga at a local park. If you've never done yoga, find a online training video.", R.drawable.yoga),
    Day(9, "Gardening", "Do you have a garden or yard? If so, go do some gardening and/or yard work.", R.drawable.garden),
    Day(10, "Photographer", "Walk around and take some pictures of things in nature like trees and the sunset.", R.drawable.photographer),
    Day(11, "Get More Active", "For today instead of a walk, go for a jog. Try to jog for around 1 hour.", R.drawable.jog),
    Day(12, "Meditation", "Practice some meditating in a quiet nature filled area.", R.drawable.meditate),
    Day(13, "Fly", "Go out and fly a kite.", R.drawable.kite),
    Day(14, "The Zoo", "Go to the Zoo and if you can, pet some animals.", R.drawable.zoo),
    Day(15, "Music", "Attend an outdoor concert or festival.", R.drawable.festival),
    Day(16, "Fisherman", "Go fishing at a nearby lake.", R.drawable.fish),
    Day(17, "Go Boating", "Go to a nearby lake and go boating. If you do not own a boat, rent one. The boat can be a canoe or motorboat.", R.drawable.boating),
    Day(18, "Get Some Sun", "Go to the nearest beach or park and sunbathe. Get a tan.", R.drawable.sunbathing),
    Day(19, "Hope You Brought The Picnic Basket", "Go to a park with friends or family and have a picnic.", R.drawable.picnic),
    Day(20, "Collector", "Go out and collect rocks or shells.", R.drawable.seashells),
    Day(21, "Get Even More Active", "Go for another walk and another jog. The walk and jog can each last 1 hour.", R.drawable.jog),
    Day(22, "Bean Bags", "Do a bean bag toss game with some friends or family.", R.drawable.beanbag),
    Day(23, "Tree Climber", "Find a tree and attempt to climb it. Make sure it is safe to do so.", R.drawable.treeclimber),
    Day(24, "Dining", "Find a restaurant with an outdoor seating area and dine at that restaurant.", R.drawable.dining),
    Day(25, "Chalk It Up", "Get some chalk and get creative on your driveway.", R.drawable.chalk),
    Day(26, "Dog Walker Again", "If you have a dog, walk your dog for 1 hour. If you do not have a dog, go for a walk for 2 hours.", R.drawable.dog_walk),
    Day(27, "Car Wash", "Give your car a hand wash.", R.drawable.carwash),
    Day(28, "Go Fishing Again", "Go fishing at a nearby lake.", R.drawable.fish),
    Day(29, "Star Gazing Again", "Pull a chair outside and gaze at the clouds or stars.", R.drawable.stars),
    Day(30, "Get Super Active", "To finish off the 30 days, go for an hour walk, a 30 minute jog, and a 30 minute run.", R.drawable.run),
)


